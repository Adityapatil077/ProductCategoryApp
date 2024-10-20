package com.product.ProductManagmentApplication.service;

import java.util.List;
import java.util.Optional;

import com.product.ProductManagmentApplication.model.Category;

public interface CategoryService {

	public List<Category> getAllCategories();
	public Optional<Category> getCategoryById(Long id);
	public Category saveCategory(Category category);
	public Category updateCategory(Long id, Category category);
	public void deleteCategory(Long id);
}
