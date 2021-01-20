package com.axsosacademy.axsosplatform.services;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.repositories.AlgorithmRepository;

import java.util.List;

public class AlgorithmService {

    private final AlgorithmRepository algorithmRepository;

    public AlgorithmService(AlgorithmRepository algorithmRepository) {
        this.algorithmRepository = algorithmRepository;
    }

    public List<Algorithm> getAllAlgorithms(){
        return algorithmRepository.findAll();
    }


}
