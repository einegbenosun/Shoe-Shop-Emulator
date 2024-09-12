public class MyMain {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer1 = new Customer(001, "Sean Flynn", true);
        Customer customer2 = new Customer(002, "John Ryan", false);

        // Create shoe items
        Shoe af1 = new NikeShoe("Air Force 1", 9.5, 10, 130.00);
        Shoe am90 = new NikeShoe("Air Max 90", 7, 3, 180);
        Shoe gaz = new AdidasShoe("Gazelle", 8.0, 15, 90.00);

        // Create an Order
        Order order = new Order();

        // Create an Inventory
        Inventory inventory = new Inventory();

        // Add shoes to the inventory
        inventory.addToInventory(am90, 5);
        inventory.addToInventory(gaz, 4);
        inventory.displayInventory();


        // Create purchases and add them to the order
        Purchase purchase1 = new Purchase(1, customer1, af1, 1, af1.calculateTotalPrice(2));
        Purchase purchase2 = new Purchase(2, customer2, gaz, 3, gaz.calculateTotalPrice(1));

        order.addPurchase(purchase1, inventory);
        order.addPurchase(purchase2, inventory);

        // Refund a purchase with ID 1
        boolean refunded = order.refundPurchase(1, inventory);

        // Check if refund was successful and print a message
        if (refunded) {
            System.out.println("Refund processed successfully.");
        } else {
            System.out.println("Refund failed. Purchase ID not found.");
        }

        //create stock.txt
        inventory.writeStockToFile();


        // Display the Updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
        
    }
}
