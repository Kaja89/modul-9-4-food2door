package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.Product;
import com.kodilla.modul94food2doorv2.data.Shop;
import com.kodilla.modul94food2doorv2.data.User;

public class HealthyShopService implements OrderService {
    public boolean createOrder(User user, Product product, int amount, Shop shop){
        if(product != null){
            System.out.println("New order for: " + user + " from: " + shop + " was created. Ordered products: " + product + ", amount: " + amount + " Total cost: " + product.getPrice()*amount );
            return true;
        } else {
            System.out.println("Product is unavailable. No order created");
            return false;
        }
    }
}
