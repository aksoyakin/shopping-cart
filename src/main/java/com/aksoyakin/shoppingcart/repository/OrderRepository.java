package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
