package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.entity.Order;

public interface OrderService {

    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
