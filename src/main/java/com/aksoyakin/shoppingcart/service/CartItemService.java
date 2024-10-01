package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.entity.CartItem;

public interface CartItemService {

    void addItemToCart(Long cartId, Long productId, int quantity);

    void removeItemFromCart(Long cartId, Long productId);

    void updateItemQuantity(Long cartId, Long productId, int quantity);

    CartItem getCartItem(Long cartId, Long productId);
}
