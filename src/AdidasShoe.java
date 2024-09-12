/**
 * Represents a shoe from the Adidas brand.
 */
public class AdidasShoe extends Shoe {
    /**
     * Constructs an AdidasShoe object.
     * @param model The model of the shoe.
     * @param size The size of the shoe.
     * @param stockCount The count of shoes in stock.
     * @param price The price of the shoe.
     */
    public AdidasShoe(String model, double size, int stockCount, double price) {
        super("Adidas", model, size, stockCount, price);
    }
}
