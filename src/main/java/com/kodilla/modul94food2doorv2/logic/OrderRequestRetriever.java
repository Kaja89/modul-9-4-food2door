package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.HealthyShop;
import com.kodilla.modul94food2doorv2.data.OrderRequest;
import com.kodilla.modul94food2doorv2.data.Orange;
import com.kodilla.modul94food2doorv2.data.Product;
import com.kodilla.modul94food2doorv2.data.Shop;
import com.kodilla.modul94food2doorv2.data.User;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Adam", "Nowak");
        Product product = new Orange("pomarańcza", 1.50);
        Shop shop = new HealthyShop("Healthy shop");

        return new OrderRequest(user, product, 2, shop);
    }
}
