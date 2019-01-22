package net.kzn.Onlineshopping.service;

import java.util.List;

import net.kzn.Onlineshopping.model.Category;

public interface CategoryService {
	
	public List<Category> getCategoryList();
	
	//get the products on given id
	Category get(int id);

}
