package com.springboot.blog.service;

import com.springboot.blog.payload.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto addCategory(final CategoryDto categoryDto);

    CategoryDto getCategory(final Long categoryId);

    List<CategoryDto> getAllCategories();

    CategoryDto updateCategory(final Long id, final CategoryDto categoryDto);

    void deleteCategory(final Long id);

}
