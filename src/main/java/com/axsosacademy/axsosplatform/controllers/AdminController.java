package com.axsosacademy.axsosplatform.controllers;

import com.axsosacademy.axsosplatform.models.Algorithm;
import com.axsosacademy.axsosplatform.models.Topic;
import com.axsosacademy.axsosplatform.models.User;
import com.axsosacademy.axsosplatform.services.AlgorithmService;
import com.axsosacademy.axsosplatform.services.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    private final AlgorithmService algorithmService;
    private final TopicService topicService;

    public AdminController(AlgorithmService algorithmService, TopicService topicService) {
        this.algorithmService = algorithmService;
        this.topicService = topicService;
    }
    //Get topics for Algorithm Admin Page
    @GetMapping("/algorithms/showTopics")
    public String showTopics(@ModelAttribute("algorithm") Algorithm algorithm, Model model, HttpSession session) {
        List<Topic> allTopics = topicService.findAllTopics();
        model.addAttribute("allTopics",allTopics);
        return "/topicsPageAdmin.jsp";
    }

    //Create a new algorithm
    @PostMapping("/algorithms/new")
    public String createAlgorithm(@Valid @ModelAttribute("algorithm") Algorithm algorithm, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        if(result.hasErrors()) {

            return "/topicsPageAdmin.jsp";
        }
        this.algorithmService.createAlgorithm(algorithm);
        return "redirect:/algorithms/showTopics";
    }

    // Add a Topic inside topics dropdown
    @GetMapping("/addTopic")
    public String addTopic(@Valid @ModelAttribute("topic") Topic topic, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        return "addTopic.jsp";
    }

    @PostMapping("/addTopic")
    public String createTopic(@Valid @ModelAttribute("topic") Topic topic, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        this.topicService.create(topic);
        return "redirect:/algorithms/showTopics";
    }

}
