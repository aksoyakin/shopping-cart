package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.entity.Cart;
import com.aksoyakin.shoppingcart.model.entity.User;

import java.math.BigDecimal;

public interface CartService {

    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
