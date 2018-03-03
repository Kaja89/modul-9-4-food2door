package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.Product;
import com.kodilla.modul94food2doorv2.data.Shop;
import com.kodilla.modul94food2doorv2.data.User;

public interface OrderService {
    boolean createOrder(User user, Product product, int amount, Shop shop);
}
