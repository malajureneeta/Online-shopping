package net.kzn.Onlineshopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.Onlineshopping.model.Product;
import net.kzn.Onlineshopping.service.CategoryService;
import net.kzn.Onlineshopping.service.ProductService;

public class ProductTestCase 
{

	
	
	private static AnnotationConfigApplicationContext context;
	private static ProductService productService;
	private Product product;
	
	
	
	@BeforeClass
	public static void init() 
	{

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.Onlineshopping");
		context.refresh();

		productService = (ProductService) context.getBean("productService");

	}
	
	
	/* fro crud
	@Test
	public void testCRUDProduct()
	{
		
		//crud opertion
		product = new Product();
				
		/*
		product.setName("Oppo Selfie Mobile");
		product.setBrand("Oppo");
		product.setDescription("This is some description for oppo");
		product.setUnitPrice(250000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		
		
		
		assertEquals("Add Operation", true,productService.add(product));
		*/
		
		
		
		//for reading and updating the category
	
		/*
		product = productService.get(1);
		product.setName("santosh");

		
		assertEquals("went wrong while update", true,productService.update(product));
	
	  */
		
		
		
		/*
		//for delete the product from the table
		
		
		product=productService.get(3);
		assertEquals("delete went wrong",true,productService.delete(product));
		
		*/
		
		
		/* for the list of products
		
		
		assertEquals("list went wrong",1,productService.getProductList().size());
		
		
	}
	
	
	*/
	
	
	
	
	@Test	
	public void testListActiveProducts()
	{
		
		
		assertEquals("list active went wrong",2,productService.listActiveProducts().size());
		
	}
	
	@Test
	public void testlistActiveProductsByCategory()
	{
		assertEquals("went wrong product by category grp",2,productService.listActiveProductsByCategory(3).size());
	}
	
	
	
	
	@Test
	public void testgetLatestActiveProducts()
	{
		
		
		assertEquals("went wrong for latest active products",2,productService.getLatestActiveProducts(2).size());
	}
}
