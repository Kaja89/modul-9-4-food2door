package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.Product;
import com.kodilla.modul94food2doorv2.data.Shop;
import com.kodilla.modul94food2doorv2.data.User;

public class HealthyShopRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, int amount, Shop shop){
        if(product!=null){
            System.out.println("New repository was created: " + user + " " + product + " amont: " + amount + " " + shop);
            return true;
        } else {
            System.out.println("Nothing added to repository");
            return false;
        }
    }
}
