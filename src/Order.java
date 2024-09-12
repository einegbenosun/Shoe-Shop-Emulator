import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents an order containing multiple purchases made by a customer.
 */
public class Order {
    // List to hold purchases made in the order
    private List<Purchase> purchases;
    
    // Date when the order was created
    private Date orderDate;
    
    // Indicates whether the order is completed
    private boolean isCompleted;

    /**
     * Initializes an order with an empty list of purchases, the current date and time, and sets completion status to false.
     */
    public Order() {
        this.purchases = new ArrayList<>();
        this.orderDate = new Date(); // Current date and time when the order is created
        this.isCompleted = false; // The order is initially not completed
    }

    /**
     * Adds a purchase to the order.
     * @param purchase The purchase object to be added to the order.
     */
    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    /**
     * Retrieves the list of purchases in the order.
     * @return The list of purchases made in the order.
     */
    public List<Purchase> getPurchases() {
        return purchases;
    }

    /**
     * Gets the date when the order was created.
     * @return The date and time when the order was created.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Checks if the order is completed.
     * @return True if the order is completed, otherwise false.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Marks the order as completed.
     */
    public void markCompleted() {
        isCompleted = true;
    }


     /**
     * Process a purchase and update inventory.
     * @param purchase The purchase to be processed.
     * @param inventory The inventory to update with the purchase.
     * @return True if the purchase was successful, false otherwise.
     */
    public boolean addPurchase(Purchase purchase, Inventory inventory) {
        purchases.add(purchase);
        purchase.updateInventoryOnPurchase(inventory);
        return true; // Purchase successful
    }

    /**
     * Refund a purchase and update inventory.
     * @param purchaseId The ID of the purchase to be refunded.
     * @param inventory The inventory to update after refunding.
     * @return True if the refund was successful, false otherwise.
     */
    public boolean refundPurchase(int purchaseId, Inventory inventory) {
        for (Purchase purchase : purchases) {
            if (purchase.getPurchaseId() == purchaseId) {
                purchase.updateInventoryOnRefund(inventory);
                purchases.remove(purchase);
                return true; // Refund successful
            }
        }
        return false; // Purchase ID not found
    }
}