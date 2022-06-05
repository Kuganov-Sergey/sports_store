package com.spring.kuganov.sports_store.controllers;

import com.spring.kuganov.sports_store.entity.Role;
import com.spring.kuganov.sports_store.entity.Status;
import com.spring.kuganov.sports_store.entity.User;
import com.spring.kuganov.sports_store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        System.out.println("its new");
        return "register";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        user.setRole(Role.USER);
        user.setStatus(Status.ACTIVE);
        userService.saveUser(user);
        System.out.println("go to redirect!");
        return "redirect:/auth/login";
    }
}
