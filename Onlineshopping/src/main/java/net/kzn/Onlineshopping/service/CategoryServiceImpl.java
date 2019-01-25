package net.kzn.Onlineshopping.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.Onlineshopping.model.Category;

@Repository("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private SessionFactory sessionFactory;
		
	public List<Category> getCategoryList()	{
		
		
		//hql command:
		String selectActiveCategory = "FROM Category WHERE active =:active";
		
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		
		return query.getResultList();
		
	}
	public Category get(int id) 
	{
	
		/*
		//enhanced for loop for id iteration
		for(Category category : categories)
		{
			if (category.getId()  ==  id) return  category;
		}
		*/
			
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	}

	
	
	public boolean add(Category category) 
	{
		
		try
		{
			
			sessionFactory.getCurrentSession().persist(category);
			
			
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}
	
	
	

	// for updating asingle category
	public boolean update(Category category) 
	{
		try
		{			
			sessionFactory.getCurrentSession().update(category);					
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
		
	}
	
	

	public boolean delete(Category category)
	{
     category.setActive(false);
		
		try
		{			
			sessionFactory.getCurrentSession().update(category);					
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
		
	}

}
