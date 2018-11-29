package com.oviya.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oviya.dao.CartItemDao;
import com.oviya.model.Cart;
import com.oviya.model.CartItem;
import com.oviya.model.CustomerOrder;

@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
	private CartItemDao cartItemDao;
	public void saveOrUpdateCartItem(CartItem cartItem) {
		cartItemDao.SaveOrUpdateCartItem(cartItem);
		
		// TODO Auto-generated method stub

	}

	public void removeCartItem(int cartItemId) {
		cartItemDao.removeCartItem(cartItemId);
		// TODO Auto-generated method stub

	}

	public Cart getCart(int cartId) {
		
		return cartItemDao.getCart(cartId);// TODO Auto-generated method stub
		
	}

	public CustomerOrder createOrder(Cart cart) {
		// TODO Auto-generated method stub
		return cartItemDao.createOrder(cart);
	}

}
