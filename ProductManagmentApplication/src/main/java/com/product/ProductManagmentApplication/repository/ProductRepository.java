package com.product.ProductManagmentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.ProductManagmentApplication.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
