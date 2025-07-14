package org.example;

public class MarketApp {
    public static void main(String[] args) {
        ProductWarehouse.initializeWarehouse();
        CashRegister.startShopping();
    }
}
