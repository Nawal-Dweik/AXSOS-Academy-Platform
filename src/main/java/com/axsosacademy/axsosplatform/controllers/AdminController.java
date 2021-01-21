package com.axsosacademy.axsosplatform.controllers;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.Topic;
import com.axsosacademy.axsosplatform.services.AlgorithmService;
import com.axsosacademy.axsosplatform.services.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    private final AlgorithmService algorithmService;
    private final TopicService topicService;

    public AdminController(AlgorithmService algorithmService, TopicService topicService) {
        this.algorithmService = algorithmService;
        this.topicService = topicService;
    }

    @RequestMapping("/adminTopics")
    public List<Topic> getTopicsPage(@ModelAttribute("newAlgorithm") Algorithm algorithm, BindingResult result){
        List<Topic> allTopics = topicService.findAll();
        return allTopics;
    }

    @RequestMapping("/createAlgorithm")
    public Algorithm createAlgorithm(@ModelAttribute("newAlgorithm") Algorithm algorithm, BindingResult result){
        if(result.hasErrors()){
            return null;
        } else {
            Algorithm algo = algorithmService.createAlgorithm(algorithm);
            return algo;
        }
    }

}
