package com.example.demoweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller

public class Controller {
    @ResponseBody
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(){
        return "Here will be main page.";
    }
}
