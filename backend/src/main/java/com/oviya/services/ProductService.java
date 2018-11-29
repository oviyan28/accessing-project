package com.oviya.services;

import java.util.List;

import com.oviya.model.Category;
import com.oviya.model.Product;


public interface ProductService {
	List<Product> getAllProducts();
	Product getProduct(int id);
	void deleteProduct(int id);
	List<Category> getAllCategories();
	void saveOrUpdateProduct(Product product);
}
