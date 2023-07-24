package com.wildCodeSchool.ExoYvens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wildCodeSchool.ExoYvens.entity.Secret;
import com.wildCodeSchool.ExoYvens.repository.SecretRepository;

@Controller
public class SecretController {

    @Autowired
    private SecretRepository secretRepository;

    @GetMapping("/secrets")
    public String getAll(Model model){
        model.addAttribute("secrets", secretRepository.findAll());
        return "secrets";
    }

    @PostMapping("/secrets")
    public String postSecret(@ModelAttribute Secret secret){
        secretRepository.save(secret);
        return "redirect:/secrets";
    }
    
    
}
