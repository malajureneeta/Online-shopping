package net.kzn.Onlineshopping.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.Onlineshopping.model.Product;


@Repository("productService")
@Transactional
public class ProductServiceImpl implements ProductService
{

	
	//get the HibernateSessionFactory ref bean 
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public Product get(int productId) {
		
		
		
		try
		{
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	public List<Product> getProductList() 
	{
		return sessionFactory.getCurrentSession().createQuery("FROM Product",Product.class).getResultList();
		
	}

	public boolean add(Product product) {
		try
		{
			sessionFactory.getCurrentSession().persist(product);
		return true;
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}

	public boolean update(Product product) {

		try
		{
		    sessionFactory.getCurrentSession().update(product);
		    return true;
		}
		catch(Exception ex)
		{
		return false;
		}
	}

	public boolean delete(Product product) {
		try
		{
		product.setActive(false);
		return this.update(product);
		}
		catch(Exception ex)
		{
		ex.printStackTrace();
		}
		
		
		return false;
	}

	public List<Product> listActiveProducts() {
		//hql 
		String selectActiveProducts = "From Product WHERE active =:active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(selectActiveProducts,Product.class)
				.setParameter("active", true)
				.getResultList();
	}

	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveProductsByCategory = "From Product WHERE active =:active AND categoryId = :categoryId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(selectActiveProductsByCategory,Product.class)
				.setParameter("active", true)
				.setParameter("categoryId", categoryId)
				.getResultList();
	}

	public List<Product> getLatestActiveProducts(int count) {
		
		return sessionFactory
				.getCurrentSession()
				.createQuery("FROM Product WHERE active  = :active ORDER BY id",Product.class)
				.setParameter("active", true)
			    .setFirstResult(0)
			    .setMaxResults(count) 
				.getResultList();
	}

}
