package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProdectController {

	@Autowired
	ProductService productService;

	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		Product pro = productService.saveProduct(product);
		return pro;
	}

}
