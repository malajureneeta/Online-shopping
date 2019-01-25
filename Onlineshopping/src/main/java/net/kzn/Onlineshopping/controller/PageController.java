package net.kzn.Onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.Onlineshopping.model.Category;
import net.kzn.Onlineshopping.model.Product;
import net.kzn.Onlineshopping.service.CategoryService;
import net.kzn.Onlineshopping.service.ProductService;

@Controller
public class PageController 
{
	
	//get the ref of CategoryService
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	
	
	@RequestMapping(value= {"/", "/home","/index"})
	public ModelAndView index()
	{
		
		
		ModelAndView mv = new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to Spring MVC Project");
		mv.addObject("title","Home");
		
		//passing the list of categories to the ui
		mv.addObject("categories",categoryService.getCategoryList());
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	
	//mapping for contact href
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
				
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	
	//maping for contact
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		
		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	

	//all the products
	@RequestMapping(value="/show/all/products")
	public ModelAndView showCategoryProducts()
	{
		ModelAndView mv = new ModelAndView("page");		

		mv.addObject("title","All Products");		
			
		//pass the list of categories to the view
		mv.addObject("categories", categoryService.getCategoryList());
		
		mv.addObject("userClickAllProducts",true);
		
		return mv;
	
	}
	
	//load all the data from the service class
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int  id)
	{
		ModelAndView mv = new ModelAndView("page");	
		
		Category category = null;		
		category = categoryService.get(id);		
		
		mv.addObject("title", category.getName());
		
		//pass the list of categories to the view
		mv.addObject("categories", categoryService.getCategoryList());
		
		//passing a single category
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts",true);
		
		return mv;
	
	}
	
	
	//for image view and add requestmapping
	
	
	//for the product view request
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id)
	{
		
		ModelAndView mv = new ModelAndView("page"); //master page
		
		
		//get the product class ref
		Product product = productService.get(id);
		
		
		//update the views count from product
		product.setViews(product.getViews() +1);
		productService.update(product);
		
		
		//title of the product selection
		mv.addObject("title",product.getName());
		mv.addObject("product", product);
		
		mv.addObject("userClickShowProduct", true);
		
		
		return mv;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
