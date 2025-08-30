package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping("/home/{color}")
  public String home(Model page,@PathVariable String color
          ,@RequestParam(required = false) String name) {
    System.out.println(">>> Model class: " + page.getClass());
    page.addAttribute("username", name);
    page.addAttribute("color", color);
    return "home.html";
  }
}