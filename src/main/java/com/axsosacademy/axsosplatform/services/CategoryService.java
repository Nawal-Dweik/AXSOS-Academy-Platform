package com.axsosacademy.axsosplatform.services;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.Category;
import com.axsosacademy.axsosplatform.models.Topic;
import com.axsosacademy.axsosplatform.repositories.AlgorithmRepository;
import com.axsosacademy.axsosplatform.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category create(Category category) {

        return categoryRepository.save(category);
    }
}
