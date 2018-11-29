package com.oviya.dao;

import com.oviya.model.Cart;
import com.oviya.model.CartItem;
import com.oviya.model.CustomerOrder;

public interface CartItemDao {
void SaveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);

}
