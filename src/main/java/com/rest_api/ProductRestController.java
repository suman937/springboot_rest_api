package com.rest_api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		// logic for future
		System.out.println(p);
		
		return "product saved";
		
	}
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		Product p = null;
		if(pid== 101) {
			p = new Product(101, "Mouse", 500.00);
			
		}else if(pid == 102) {
			p = new Product(102, "HD", 3500.00);
			
		}
		return p;
	}
	@GetMapping("/products")
	public List<Product> getProducts(){
		Product p1 = new Product(101, "Mouse", 500.00);
		Product p2 = new Product(101, "HD", 3500.00);
		
		return Arrays.asList(p1,p2);
	}

}
