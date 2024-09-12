
public class Customer {
    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final int customerId;
    private final String name;
    private boolean isMember;

    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * The constructor creates an instance of the class Customer.
     * @param customerId - The ID of the customer.
     * @param name - The name of the customer.
     * @param isMember - Whether the customer is a member or not.
     */
    public Customer(int customerId, String name, boolean isMember) {
        this.customerId = customerId;
        this.name = name;
        this.isMember = isMember;
    }

    //---------------------------------------
    //	GET METHODS
    //---------------------------------------

    /**
     * Get the customer ID.
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Get the customer's name.
     * @return The customer's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Check if the customer is a member.
     * @return True if the customer is a member, false otherwise.
     */
    public boolean isMember() {
        return isMember;
    }

    //---------------------------------------
    //	SET METHODS
    //---------------------------------------

    /**
     * Set whether the customer is a member.
     * @param memberStatus - True if the customer is a member, false otherwise.
     */
    public void setMember(boolean memberStatus) {
        this.isMember = memberStatus;
    }
}