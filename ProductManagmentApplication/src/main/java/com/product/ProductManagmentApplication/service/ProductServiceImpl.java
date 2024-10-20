package com.product.ProductManagmentApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.product.ProductManagmentApplication.model.Product;
import com.product.ProductManagmentApplication.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        throw new RuntimeException("Product not found");
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);		
	}
	
	
}
