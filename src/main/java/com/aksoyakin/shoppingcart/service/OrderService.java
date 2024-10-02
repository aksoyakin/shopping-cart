package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getUserOrders(Long userId);

    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
