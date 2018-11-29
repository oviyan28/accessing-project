package com.oviya.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oviya.model.Category;
import com.oviya.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		//HQL - Hibernate query Language
		Query query=session.createQuery("from Product ");//Select * from Product
		
		return query.list();
		// TODO Auto-generated method stub
	
	}

	public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);//select * from product where id=1
		return product;
		// TODO Auto-generated method stub
	
	}

	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		//select * from product where id=?
		Product product=(Product)session.get(Product.class, id);
		//delete from product where id=?
		session.delete(product);
		// TODO Auto-generated method stub

	}

	public List<Category> getCategories() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		return query.list();//List of Category objects
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdateProduct(Product product) {
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println("BEFORE INSERT/UPDATE " + product.getId());
		//if id==0, insert query
		//if id exits in the table, update query
		session.saveOrUpdate(product);//INsert into product values (?,.....)
		System.out.println("AFTER INSERT/UPDATE " + product.getId());
	
		// TODO Auto-generated method stub

	}

}
