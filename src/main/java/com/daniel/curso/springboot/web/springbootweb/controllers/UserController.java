package com.daniel.curso.springboot.web.springbootweb.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.daniel.curso.springboot.web.springbootweb.models.User;



@Controller
public class UserController {
    @GetMapping("/details")   
    public String details(Model model) {
        User user = new User("Daniel", "Garcia", "dani.gar.usc@gmail.com");        
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");        
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(
                new User("Pepa", "Gonzalez", "pepa@gmail.com"),
                new User("Lalo", "Roe"),
                new User("Andres", "Doe", "Andres@gmail.com")
            );
    }
}
