package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
