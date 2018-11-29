package com.oviya.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oviya.dao.ProductDao;
import com.oviya.model.Category;
import com.oviya.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
	return productDao.getAllProducts();
	}

	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.getProduct(id);
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);// TODO Auto-generated method stub

	}

	public List<Category> getAllCategories() {
		return productDao.getCategories();// TODO Auto-generated method stub
	
	}

	public void saveOrUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.saveOrUpdateProduct(product);
	}

}
