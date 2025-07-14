package org.example;

import java.util.ArrayList;

public class ShoppingCart {
   private ArrayList<Product> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Product product){
        if(product.getProductQuantity() > 0){
            items.add(product);
            product.decreaseStock(1);
        }
    }

    public void displayCart(){
        for(Product product:items){
            System.out.println(product.getInfo());
        }
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for(Product product:items){
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }

    public ArrayList<Product> getItems(){
        return items;
    }

}
