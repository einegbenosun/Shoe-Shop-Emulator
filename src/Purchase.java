/**
 * Represents a purchase made by a customer.
 */
public class Purchase {
    private int purchaseId; // Unique ID for each purchase
    private Customer customer;
    private Shoe shoe;
    private int quantity;
    private double totalPrice;

    /**
     * Constructs a Purchase object with a purchase ID.
     * @param purchaseId The unique ID for this purchase.
     * @param customer The customer making the purchase.
     * @param shoe The shoe being purchased.
     * @param quantity The quantity of shoes being purchased.
     * @param totalPrice The total price for the purchase.
     */
    public Purchase(int purchaseId, Customer customer, Shoe shoe, int quantity, double totalPrice) {
        this.purchaseId = purchaseId;
        this.customer = customer;
        this.shoe = shoe;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    /**
     * Get the purchase ID.
     * @return The purchase ID.
     */
    public int getPurchaseId() {
        return purchaseId;
    }

    /**
     * Set the purchase ID.
     * @param purchaseId The purchase ID to set.
     */
    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * Get the customer who made the purchase.
     * @return The customer object.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Set the customer for this purchase.
     * @param customer The customer making the purchase.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Get the shoe that was purchased.
     * @return The shoe object.
     */
    public Shoe getShoe() {
        return shoe;
    }

    /**
     * Set the shoe for this purchase.
     * @param shoe The shoe being purchased.
     */
    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    /**
     * Get the quantity of shoes purchased.
     * @return The quantity of shoes.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity of shoes for this purchase.
     * @param quantity The quantity of shoes being purchased.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the total price for this purchase.
     * @return The total price.
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Set the total price for this purchase.
     * @param totalPrice The total price for the purchase.
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

     /**
     * Update the inventory after a purchase is made.
     * @param inventory The inventory to update after the purchase.
     */
    public void updateInventoryOnPurchase(Inventory inventory) {
        inventory.removeFromInventory(shoe, quantity);
    }

    /**
     * Update the inventory after a purchase is refunded.
     * @param inventory The inventory to update after the refund.
     */
    public void updateInventoryOnRefund(Inventory inventory) {
        inventory.addToInventory(shoe, quantity);
    }
}