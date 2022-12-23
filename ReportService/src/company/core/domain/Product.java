package company.core.domain;

public class Product {
    private static int counter;
    private String prId;
    private String name;
    private int catId;

    {
        prId = "prod_" + ++counter;
    }
    
    public Product(String name, int catId) {
        this.name = name;
        this.catId = catId;
    }
    
    public Product() {
    }

    public String getPrId() {
        return prId;
    }
    public String getName() {
        return name;
    }
    public int getCatId() {
        return catId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Override
    public String toString() {
        return String.format("prId %d", prId);
    }
    
}