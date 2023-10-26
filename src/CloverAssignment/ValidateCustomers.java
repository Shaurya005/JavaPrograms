import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCustomers {

    private final String file;
    Map<String, List<String>> customersMap;

    public ValidateCustomers(String file)
    {
        this.file = file;
        customersMap = new LinkedHashMap<>();

        readCustomerDetails();
    }

    public void readCustomerDetails()
    {
        List<String> lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            br.readLine();
            String str;

            while((str = br.readLine()) != null)
            {
                lines.add(str);
            }

            validateCustomers(lines);
        }
        catch (IOException exc) {
            // e.printStackTrace();
            System.out.println(exc.getMessage());
        }
    }

    public void validateCustomers(List<String> customers)
    {
        customers.forEach(
            (customer) -> {
                String[] customerDetails = customer.split(",");
                try {
                    if (customerDetails.length < 5) {
                        throw new MyCustomException("Phone number is required.");
                    } else {
                        Matcher matcher = Pattern.compile("^[0-9]*$").matcher(customerDetails[4]);

                        if (!matcher.matches()) {
                            throw new MyCustomException("Phone number can only contain numbers.");
                        }
                        if (customerDetails[4].length() != 10) {
                            throw new MyCustomException("Phone number should be of length 10 only.");
                        }

                        customersMap.put(customerDetails[4], Arrays.asList(customerDetails[1], customerDetails[2], customerDetails[3], customerDetails[4]));
                    }
                } catch (MyCustomException e) {
                    if (customerDetails.length > 4) {
                        System.out.println(customerDetails[4] + ": " + e.getMessage());
                    } else {
                        System.out.println(e.getMessage());
                    }
                }
            }
        );
    }
}