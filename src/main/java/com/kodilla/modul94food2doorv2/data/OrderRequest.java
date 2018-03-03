package com.kodilla.modul94food2doorv2.data;

import com.kodilla.modul94food2doorv2.data.Product;
import com.kodilla.modul94food2doorv2.data.Shop;
import com.kodilla.modul94food2doorv2.data.User;

public class OrderRequest {
    private User user;
    private Product product;
    private int amount;
    private Shop shop;

    public OrderRequest(User user, Product product, int amount, Shop shop) {
        this.user = user;
        this.product = product;
        this.amount = amount;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public Shop getShop() {
        return shop;
    }
}
