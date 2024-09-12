/**
 * Represents a shoe from the Nike brand.
 */
public class NikeShoe extends Shoe {
    /**
     * Constructs a NikeShoe object.
     * @param model The model of the shoe.
     * @param size The size of the shoe.
     * @param stockCount The count of shoes in stock.
     * @param price The price of the shoe.
     */
    public NikeShoe(String model, double size, int stockCount, double price) {
        super("Nike", model, size, stockCount, price);
    }
}

