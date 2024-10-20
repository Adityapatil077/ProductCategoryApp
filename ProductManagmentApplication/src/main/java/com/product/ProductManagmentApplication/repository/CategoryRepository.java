package com.product.ProductManagmentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.ProductManagmentApplication.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
