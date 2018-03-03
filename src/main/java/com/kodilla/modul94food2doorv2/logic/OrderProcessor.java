package com.kodilla.modul94food2doorv2.logic;

import com.kodilla.modul94food2doorv2.data.OrderDto;
import com.kodilla.modul94food2doorv2.data.OrderRequest;
import com.kodilla.modul94food2doorv2.logic.InformationService;
import com.kodilla.modul94food2doorv2.logic.OrderRepository;
import com.kodilla.modul94food2doorv2.logic.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getAmount(), orderRequest.getShop());
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getAmount(), orderRequest.getShop());
            return new OrderDto(orderRequest.getUser(), true);
        } else{
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
