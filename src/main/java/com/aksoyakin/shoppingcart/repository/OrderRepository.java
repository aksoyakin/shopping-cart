package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
