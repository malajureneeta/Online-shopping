package net.kzn.Onlineshopping.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.Onlineshopping.model.Category;
import net.kzn.Onlineshopping.service.CategoryService;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryService categoryService;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.Onlineshopping");
		context.refresh();

		categoryService = (CategoryService) context.getBean("categoryService");

	}

	// adding to database
	/*
	 * 
	 * @Test public void testAddCategory() { category = new Category();
	 * category.setName("Laptop"); category.setDescription("Lenovo brand");
	 * category.setImageURL("cat_2.png");
	 * 
	 * 
	 * assertEquals("succes added the catehory into the table",true,categoryService.
	 * add(category));
	 * 
	 * 
	 * }
	 */

	/* to get a single category from the database table */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * 
	 * category = categoryService.get(1);
	 * assertEquals("success fecthed a single category","Television",category.
	 * getName()); }
	 */

	// test for update category

	
	/*
	@Test
	public void testUpdateCategory() {

		category = categoryService.get(1);

		category.setName("Tv");

		assertEquals("success changd asingle category ", true, categoryService.update(category));

	}
	
	*/
	
	//for delete a category from the db
	
	/*
	@Test
	public void testDeleteCategory() {

		category = categoryService.get(1);

		assertEquals("success changd asingle category ", true, categoryService.delete(category));

	}
	
*/
	
	
	/*
	 //for chechimg the number of active list from db
	
	@Test
	public void testListCategory() {

				assertEquals("success list  ", 3, categoryService.getCategoryList().size());

	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	//for: crud test
	
	@Test
	
	
	
	public void testCRUDCategory()
	{
		
	}
}
