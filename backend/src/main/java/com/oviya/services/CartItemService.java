package com.oviya.services;

import com.oviya.model.Cart;
import com.oviya.model.CartItem;
import com.oviya.model.CustomerOrder;

public interface CartItemService {
	void saveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);
}

