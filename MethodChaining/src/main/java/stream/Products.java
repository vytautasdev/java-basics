package stream;

public class Products {

    public int pId;
    public String pName;
    public float price;
    public int quantity;
    public String brand;
    public double deliveryCharges;

    public Products(int pId, String pName, float price, int quantity, String brand, double deliveryCharges) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.deliveryCharges = deliveryCharges;
    }

    @Override
    public String toString() {
        return "Products{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", deliveryCharges=" + deliveryCharges +
                '}';
    }
}
