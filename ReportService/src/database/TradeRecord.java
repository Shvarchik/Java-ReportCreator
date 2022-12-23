package database;

/**
 * Единица "поставки": продукт - цена - количество
 */
public class TradeRecord {
   
    private String productID;
    private double price;
    private int quantity;
    
    public TradeRecord(int productID, double price, int quantity) {
      
        this.productID = "prod_" + productID;
        this.price = price;
        this.quantity = quantity;
    }
        
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
        
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, Price=%f Quantity=%d", productID, price, quantity);
    }
    
}
