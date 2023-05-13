package com.blogapp.services;

import java.util.List;

import com.blogapp.dto.CategoryDto;

public interface CategoryService {

	
	//  create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	// delete
	void categoryDelete(Integer categoryId);
	
	// get
	CategoryDto getCategory(Integer categoryId);
	// get All
	
	List<CategoryDto> getAllCategories();
	
	
}
