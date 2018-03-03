package com.kodilla.modul94food2doorv2.data;

public abstract class Shop {
    String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
