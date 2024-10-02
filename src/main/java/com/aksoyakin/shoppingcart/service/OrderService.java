package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.dto.OrderDto;
import com.aksoyakin.shoppingcart.model.entity.Order;

import java.util.List;

public interface OrderService {

    List<OrderDto> getUserOrders(Long userId);

    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);
}
