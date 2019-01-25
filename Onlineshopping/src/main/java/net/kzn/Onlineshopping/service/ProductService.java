package net.kzn.Onlineshopping.service;

import java.util.List;

import net.kzn.Onlineshopping.model.Product;

public interface ProductService {

	Product get(int productId);

	List<Product> getProductList();

	boolean add(Product product);

	boolean update(Product product);

	boolean delete(Product product);

	// bussiness logic methods
	List<Product> listActiveProducts();

	List<Product> listActiveProductsByCategory(int categoryId);

	List<Product> getLatestActiveProducts(int count);

}
