package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
