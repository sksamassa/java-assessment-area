package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String list() {
        return "Здесь будет главная страница";
    }

}
