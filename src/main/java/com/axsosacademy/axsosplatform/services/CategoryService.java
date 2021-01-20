package com.axsosacademy.axsosplatform.services;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.Category;
import com.axsosacademy.axsosplatform.repositories.AlgorithmRepository;
import com.axsosacademy.axsosplatform.repositories.CategoryRepository;

import java.util.List;

public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
