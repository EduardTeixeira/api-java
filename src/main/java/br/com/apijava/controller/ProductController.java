package br.com.apijava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apijava.entity.Product;
import br.com.apijava.service.ProductService;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	@CrossOrigin
	public List<Product> healthTest() {

		return productService.getProductsList();
	}

}
