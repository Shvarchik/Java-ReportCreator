package company.core.domain;

public class TradeItem {
    
    private static int counter = 0;
    private final int tradeId;
    private Product product;
    private double price;
    private int quantity;
    
    public TradeItem(Product product, double price, int quantity) {
        this.tradeId = ++counter;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return tradeId;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
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
        return String.format("TradeiD=%d ProductId=%d Price=%f Quantity=%d", tradeId, product.getPrId(), price, quantity);
    }
    
}
