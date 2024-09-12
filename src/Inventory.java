import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents the inventory management system for shoes.
 */
public class Inventory {
    // Map to store shoe objects and their corresponding quantities in stock
    private Map<Shoe, Integer> stock;

    /**
     * Initializes an inventory system with an empty stock map.
     */
    public Inventory() {
        this.stock = new HashMap<>();
    }

    /**
     * Adds a specified quantity of a shoe to the inventory.
     * If the shoe already exists in the inventory, its stock is updated with the additional quantity.
     * If the shoe is not present in the inventory, it is added with the given quantity.
     * Updates the stock count of the shoe accordingly.
     * @param shoe The shoe object to be added to the inventory.
     * @param quantity The quantity of the shoe to be added.
     */
    public void addToInventory(Shoe shoe, int quantity) {
        if (stock.containsKey(shoe)) {
            int currentStock = stock.get(shoe);
            stock.put(shoe, currentStock + quantity);
            shoe.increaseStockCount(quantity); // Update shoe's stock count
        } else {
            stock.put(shoe, quantity);
            shoe.setStockCount(quantity); // Set shoe's stock count
        }
    }

    /**
     * Removes a specified quantity of a shoe from the inventory.
     * @param shoe The shoe object to be removed from the inventory.
     * @param quantity The quantity of the shoe to be removed.
     * @return True if the specified quantity of the shoe was successfully removed from the inventory, otherwise false.
     */
    public boolean removeFromInventory(Shoe shoe, int quantity) {
        if (stock.containsKey(shoe)) {
            int currentStock = stock.get(shoe);
            if (currentStock >= quantity) {
                stock.put(shoe, currentStock - quantity);
                shoe.setStockCount(shoe.getStockCount() - quantity);
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves the stock count of a specific shoe in the inventory.
     * @param shoe The shoe object to check the stock count for.
     * @return The current stock count of the shoe in the inventory.
     */
    public int getStockCount(Shoe shoe) {
        return stock.getOrDefault(shoe, 0);
    }

    /**
     * Checks if a specific shoe is in stock.
     * @param shoe The shoe object to check availability in the inventory.
     * @return True if the shoe is in stock, otherwise false.
     */
    public boolean isInStock(Shoe shoe) {
        return getStockCount(shoe) > 0;
    }

    /**
     * Write the current inventory details to a text file named "stock".
     */
    public void writeStockToFile() {
        String filename = "stock.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Current Inventory:\n");
            for (Map.Entry<Shoe, Integer> entry : stock.entrySet()) {
                Shoe shoe = entry.getKey();
                int quantity = entry.getValue();
                writer.write("Shoe: " + shoe.getBrand() + " " + shoe.getModel() +
                        ", Size: " + shoe.getSize() + ", Quantity: " + quantity + "\n");
            }
            System.out.println("Stock uploaded to" + filename);
        } catch (IOException e) {
            System.out.println("Error writing stock to file: " + e.getMessage());
        }
    }

    /**
     * Displays the inventory details to the console.
     */
    public void displayInventory() {
        System.out.println("Inventory Details:");
        for (Map.Entry<Shoe, Integer> entry : stock.entrySet()) {
            Shoe shoe = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Brand: " + shoe.getBrand() + ", Model: " + shoe.getModel() +
                    ", Size: " + shoe.getSize() + ", Quantity in Inventory: " + quantity);
        }
    }

}
