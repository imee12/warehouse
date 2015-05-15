package controllers;

import models.Product;
import play.mvc.Result;
import play.mvc.Controller;
import views.html.products.list;

import java.util.List;

public class Products extends Controller {
	
	
	public static Result list() {
	    List<Product> products = Product.findAll();
	    return ok(list.render(products));
	  }
	
	public static Result newProduct() {
		return ok();
	}
	
	public static Result details(String ean) {
		return ok();
	}
	
	public static Result save() {
		return ok();
	}
	
}