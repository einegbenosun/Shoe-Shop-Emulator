/**
 * Represents a generic shoe item.
 */
public class Shoe {
    // Fields
    private final String brand;
    private final String model;
    private final double size;
    private int stockCount;
    private final double price;

    /**
     * Constructs a Shoe object.
     * @param brand The brand of the shoe.
     * @param model The model of the shoe.
     * @param size The size of the shoe.
     * @param stockCount The count of shoes in stock.
     * @param price The price of the shoe.
     */
    public Shoe(String brand, String model, double size, int stockCount, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.stockCount = stockCount;
        this.price = price;
    }

    /**
     * Get the brand of the shoe.
     * @return The brand of the shoe.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Get the model of the shoe.
     * @return The model of the shoe.
     */
    public String getModel() {
        return model;
    }

    /**
     * Get the size of the shoe.
     * @return The size of the shoe.
     */
    public double getSize() {
        return size;
    }

    /**
     * Get the stock count of the shoe.
     * @return The stock count of the shoe.
     */
    public int getStockCount() {
        return stockCount;
    }

    /**
     * Get the price of the shoe.
     * @return The price of the shoe.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the stock count for the shoe.
     * @param stockCount The stock count to set.
     */
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * Decrease the stock count by a specified amount.
     * @param amount The amount to decrease the stock count by.
     */
    public void decreaseStockCount(int amount) {
        this.stockCount -= amount;
    }

    /**
     * Increase the stock count by a specified amount.
     * @param amount The amount to increase the stock count by.
     */
    public void increaseStockCount(int amount) {
        this.stockCount += amount;
    }

    /**
     * Check if the shoe is in stock.
     * @return True if the shoe is in stock, false otherwise.
     */
    public boolean isInStock() {
        return stockCount > 0;
    }

    /**
     * Calculate the total price for a specified quantity of shoes.
     * @param quantity The quantity of shoes.
     * @return The total price for the specified quantity.
     */
    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }
}
