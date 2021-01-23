package com.axsosacademy.axsosplatform.controllers;

import com.axsosacademy.axsosplatform.models.*;
import com.axsosacademy.axsosplatform.services.AlgorithmService;
import com.axsosacademy.axsosplatform.services.CategoryService;
import com.axsosacademy.axsosplatform.services.GroupActivityService;
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
    private final CategoryService categoryService;
    private final GroupActivityService groupActivityService;

    public AdminController(AlgorithmService algorithmService, TopicService topicService, CategoryService categoryService, GroupActivityService groupActivityService) {
        this.algorithmService = algorithmService;
        this.topicService = topicService;
        this.categoryService = categoryService;
        this.groupActivityService = groupActivityService;
    }

    //***********************************************************************************************
    //Admin Algorithm Process

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
        this.algorithmService.createAlgorithm(algorithm.getTopic(),algorithm);
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

    //Get algorithm for a specific topic Admin Page
    @GetMapping("/algorithms/{topicId}")
    public String showAlgorithms(@ModelAttribute("algorithm") Algorithm algorithm,@PathVariable("topicId") Long id, Model model, HttpSession session) {
        Topic selectedTopic = topicService.findOneById(id);
        List<Algorithm> topicAlgorithms = selectedTopic.getAlgorithms();
        model.addAttribute("topicAlgorithms",topicAlgorithms);
        model.addAttribute("selectedTopic",selectedTopic);
        return "/algorithmsPageAdmin.jsp";
    }


    //***********************************************************************************************
    //Admin Group Activity Process

    //Get categories for Group Activity Admin Page
    @GetMapping("/groupActivity/showCategories")
    public String showCategories(@ModelAttribute("groupActivity") GroupActivity groupActivity, Model model, HttpSession session) {
        List<Category> allCategories = categoryService.findAllCategories();
        model.addAttribute("allCategories",allCategories);
        return "/categoriesAdminPage.jsp";
    }

    // Add a Category inside categories dropdown
    @GetMapping("/addCategory")
    public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        return "addCategory.jsp";
    }

    @PostMapping("/addCategory")
    public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        this.categoryService.create(category);
        return "redirect:/groupActivity/showCategories";
    }

    //Create a new group activity
    @PostMapping("/groupActivity/new")
    public String createGroupActivity(@Valid @ModelAttribute("groupActivity") GroupActivity groupActivity, BindingResult result, Model model, HttpSession session, @RequestParam Map<String,String> body) {
        this.groupActivityService.createGroupActivity(groupActivity.getCategory(),groupActivity);
        return "redirect:/groupActivity/showCategories";
    }



}
