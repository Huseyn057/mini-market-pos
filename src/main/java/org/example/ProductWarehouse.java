package org.example;

import java.util.ArrayList;

public class ProductWarehouse {
    private ProductWarehouse(){}
    private static ArrayList<Product> products = new ArrayList<>();
    public static void initializeWarehouse(){
        Product product1 = new Product("PRD001", "Apple iPhone 14", 999.99, 15);
        Product product2 = new Product("PRD002", "Samsung Galaxy S23", 899.50, 20);
        Product product3 = new Product("PRD003", "Xiaomi Redmi Note 13", 349.99, 35);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public static void listAllProducts(){
        for(Product product:products){
            System.out.println(product.getInfo());
        }
    }

    public static Product findProductByCode(String productCode){
        for(Product product:products){
            if(product.getProductCode().equals(productCode)){
                return product;
            }
        }
        return null;
    }
}
