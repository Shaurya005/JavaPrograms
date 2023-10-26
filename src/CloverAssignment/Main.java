package CloverAssignment;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ValidateCustomers customers = new ValidateCustomers("/Users/shaurya.jaiswal/Downloads/myFile.csv");

        System.out.println(customers.customersMap);
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<String, List<String>> customer : customers.customersMap.entrySet())
        {
            List<Order> orders = new ArrayList<>();
            System.out.println("Hey " + customer.getValue().get(0) + " " + customer.getValue().get(1)  + ", Do you want to place any order (Y/N) : ");
            String orderChoice = sc.nextLine();
            int orderId = 1;
            while (orderChoice.equals("Y")) {
                Order order = new Order(orderId++);
                List<Item> items = new ArrayList<>();
                String itemChoice = "Y";
                int itemId = 1;

                while (itemChoice.equals("Y")) {
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    items.add(new Item(name, qty, price, itemId++));
                    System.out.print("Do you want to add more items (Y/N) : ");
                    itemChoice = sc.nextLine();
                }
                order.items = items;
                orders.add(order);
                System.out.print("Do you want to place more orders (Y/N) : ");
                orderChoice = sc.nextLine();
            }

            Cart cart = new Cart(Long.valueOf(customer.getKey()), orders);
            System.out.println(cart);
        }
    }
}