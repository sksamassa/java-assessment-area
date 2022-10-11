package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostsCreateController {
    private PostService service;
    @GetMapping(path = "/")
    public String create(Model model) {
        model.addAttribute("appName", "name");
        model.addAttribute("posts", service.listAllPosts());

        return "create";
    }

    @PostMapping(path = "/")
    public String doCreate(@ModelAttribute("text") String text){
        service.create(text);
        return "redirect:/";
    }
}
