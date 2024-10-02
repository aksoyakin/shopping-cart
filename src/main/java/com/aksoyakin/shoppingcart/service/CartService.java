package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.entity.Cart;

import java.math.BigDecimal;

public interface CartService {

    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);
}
