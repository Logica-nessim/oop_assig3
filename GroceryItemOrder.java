public class GroceryItemOrder {
    public String name;
    private int quantity;
    private double price;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public GroceryItemOrder(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public double getCost()
    {
        return price * quantity;
    }
}
