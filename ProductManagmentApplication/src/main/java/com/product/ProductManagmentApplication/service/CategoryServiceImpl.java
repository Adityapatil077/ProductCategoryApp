package com.product.ProductManagmentApplication.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.product.ProductManagmentApplication.model.Category;
import com.product.ProductManagmentApplication.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategories() {
		
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Long id, Category category) {
		if (categoryRepository.existsById(id)) {
            category.setId(id);
            return categoryRepository.save(category);
        }
        throw new RuntimeException("Category not found");
	}

	@Override
	public void deleteCategory(Long id) {
		
		categoryRepository.deleteById(id);	
	}

}
