package org.example;

public class Product {
    private final String productCode;
    private final String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productCode, String productName, double productPrice, int productQuantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void decreaseStock(int quantity){
        if(quantity<=productQuantity){
            productQuantity-=quantity;
        }
        else{
            System.out.println("Product Quantity is too low");
        }
    }

    public String getInfo(){
        return String.format("%s (%s) - Price: $%.2f, Quantity: %d\n", productName, productCode, productPrice, productQuantity);
    }
}
