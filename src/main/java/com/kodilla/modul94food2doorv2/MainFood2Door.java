package com.kodilla.modul94food2doorv2;

import com.kodilla.modul94food2doorv2.data.OrderRequest;
import com.kodilla.modul94food2doorv2.logic.*;

public class MainFood2Door {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new HealthyShopService(), new HealthyShopRepository());
        orderProcessor.process(orderRequest);
    }
}
