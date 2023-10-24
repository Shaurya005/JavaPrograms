package TestAndLearn;

public class JavaSQL {

    private static final String SELECT_TOKEN = "SELECT token, COUNT(*) AS count FROM ( " +
            "SELECT alias.modified_time AS token " +
            "FROM {tableName} AS alias ";

    private static final String JOIN_MENU = "INNER JOIN menu m ON alias.menu_id = m.id WHERE m.menu_type in (?, ?) ";
    private static final String WITHOUT_JOIN_MENU = "WHERE alias.menu_type in (?, ?) ";

    private static final String WHERE_CONDITIONS = "AND alias.merchant_id = ? " +
            "AND alias.modified_time >= ? AND alias.modified_time {beforeCondition} ? " + "AND alias.deleted_time {deletedTimeCondition} " +
            "ORDER BY alias.modified_time " +
            "LIMIT {limit} OFFSET {offset} ) base " +
            "GROUP BY token " +
            "ORDER BY token ASC";

    public static void main(String args[]) {
        String sql = buildBucketSql(true);

        String sql2 = buildBucketSql(false);

        String finalSql = sql
                .replace(TABLE_NAME, filter.getTableName())
                .replace(LIMIT, String.valueOf(filter.getLimit()))
                .replace(OFFSET, String.valueOf(filter.getOffset()))
                .replace(DELETED_TIME_CONDITION, filter.isDeletedOnly() ? IS_NOT_NULL : IS_NULL)
                .replace(BEFORE_CONDITION, filter.isBeforeAndMostRecentEqual() ? LESS_EQUALS : LESS);

        System.out.println(sql1);
        System.out.println(sql2);
    }

    private static String buildBucketSql(boolean joinMenu) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append(SELECT_TOKEN);
        if (joinMenu) {
            queryBuilder.append(JOIN_MENU);
        } else {
            queryBuilder.append(WITHOUT_JOIN_MENU);
        }
        return queryBuilder.append(WHERE_CONDITIONS).toString();
    }
}
