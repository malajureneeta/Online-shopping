package net.kzn.Onlineshopping.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import net.kzn.Onlineshopping.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService
{
	
	
	static List<Category> categories = new ArrayList<Category>();
	
	
	static {
                
		Category cat1 = new Category();
		cat1.setId(1);	
	    cat1.setName("Laptop");	    
	    categories.add(cat1);
	    
	    
	    
	    cat1 = new Category();
		cat1.setId(2);	
		  cat1.setName("Pen");
	    
	    categories.add(cat1);

	}
	public List<Category> getCategoryList()
	{
		
		return categories;
		
		
	}

	public Category get(int id) {
	
		
		//enhanced for loop for id iteration
		for(Category category : categories)
		{
			if (category.getId()  ==  id) return  category;
		}
		return null;
	}

}
