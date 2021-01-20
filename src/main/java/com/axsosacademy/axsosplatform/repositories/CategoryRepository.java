package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    public List<Category> findAll();
}
