package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    public static Scanner sc = new Scanner(System.in);

    private CashRegister(){}

    public static void startShopping(){
        ShoppingCart cart = new ShoppingCart();

        while(true){
            displayMenu();
            System.out.println("Please choose from the following options:");
            int choice = sc.nextInt();
            switch(choice){
                case 1: ProductWarehouse.listAllProducts(); break;
                case 2: {
                    System.out.println("Enter the product code:");
                    String code = sc.next();
                    Product product = ProductWarehouse.findProductByCode(code);
                    if(product != null){
                        cart.addItem(product);
                        System.out.println("Product added successfully!");
                    }
                    else{
                        System.out.println("Product not found");
                    }
                    break;
                }
                case 3: {
                    cart.displayCart();
                    System.out.println("Total price: $" + cart.calculateTotalPrice());
                    break;
                }
                case 4: {
                    checkout(cart);
                    return;
                }
                default: System.out.println("Invalid choice"); break;
            }

        }
    }

    public static void checkout(ShoppingCart cart){
        ArrayList<Product> items = cart.getItems();
        double totalPrice = 0;
          for(Product product:items){
              product.decreaseStock(1);
              totalPrice +=  product.getProductPrice();
          }
        System.out.println("Payment completed. Total price: $" + totalPrice);
    }

    public static void displayMenu(){
        System.out.println(
                """
                        "1. Bütün məhsullara bax"
                        "2. Səbətə məhsul əlavə et (koda görə)"
                        "3. Səbətə bax"
                        "4. Ödənişi tamamla"
                        """
        );
    }
}
