package com.example.thymleafeingabe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Eingabe {

    @GetMapping ("/")
    public String processForm(
            @RequestParam(value = "userInput", required = false) String userInput,
            Model model){

        if(userInput == null){
            userInput = "";
        }

        userInput = "Hallo " + userInput;

        model.addAttribute("name", userInput);
        return "name";
    }
}
