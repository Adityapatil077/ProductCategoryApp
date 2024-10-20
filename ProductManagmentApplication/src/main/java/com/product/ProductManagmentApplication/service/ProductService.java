package com.product.ProductManagmentApplication.service;

import java.util.List;
import java.util.Optional;

import com.product.ProductManagmentApplication.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	public Optional<Product> getProductById(Long id);
	public Product saveProduct(Product product);
	public Product updateProduct(Long id, Product product);
	public void deleteProduct(Long id);
}
