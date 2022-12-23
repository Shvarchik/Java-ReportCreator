package company.core.domain;

import java.util.ArrayList;

public class ProductCategory {
    private static int counter;
    private int catId;
    private String categoryName;

    {
        catId = ++counter;
    }
    
    private ArrayList <Product> productList;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addProduct (Product product) {
        productList.add(product);
    }

    public int getCatId() {
        return catId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
