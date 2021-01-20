package com.axsosacademy.axsosplatform.repositories;

import com.axsosacademy.axsosplatform.models.Algorithm;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlgorithmRepository extends CrudRepository<Algorithm, Long> {
    public List<Algorithm> findAll();


}
