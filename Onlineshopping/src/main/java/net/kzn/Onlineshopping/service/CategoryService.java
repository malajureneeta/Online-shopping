package net.kzn.Onlineshopping.service;

import java.util.List;

import net.kzn.Onlineshopping.model.Category;

public interface CategoryService {
	
	
	//to get a category
	Category get(int id);
	
	//to get list of category
	public List<Category> getCategoryList();
	
	
	//to add a category to the database
	boolean add(Category category);
	
	//to update a category
	boolean update(Category category);
	
	
	//to delete a category 
	boolean delete(Category category);
	
	
}
