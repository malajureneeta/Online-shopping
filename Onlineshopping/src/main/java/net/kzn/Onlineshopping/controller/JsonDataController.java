package net.kzn.Onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kzn.Onlineshopping.model.Product;
import net.kzn.Onlineshopping.service.ProductService;

@Controller
@RequestMapping("/json/data")
public class JsonDataController
{
		
	@Autowired
	private ProductService productService;	
	
	@RequestMapping("/all/products")
	@ResponseBody	
	public List<Product> getAllProducts()
		{
		
		return productService.listActiveProducts();
		
		}

	
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody	
	public List<Product> getProductsByCategory(@PathVariable  int id)
		{
		
		return productService.listActiveProductsByCategory(id);
		
		}

}
