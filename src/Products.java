public class Products {
    // properties
    private int id;
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    // constructor
    Products(int id, String pname, int qty,
            double price, double totalPrice) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    // getter methods
    public int getId() {
        return id;
    }
    public String getPname() {
        return pname;
    }
    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    // displayFormat
    public static void displayFormat() {
        System.out.print(
                "\nId      Name      Quantity    Price   Total Price\n");
    }

    // display
    public void display() {
        System.out.format("%d %-9s %8d %10.2f %10.2f\n",
                id, pname, qty, price, totalPrice);
    }
}
