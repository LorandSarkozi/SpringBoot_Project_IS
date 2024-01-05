package com.example.is_project2.controllers;

import com.example.is_project2.model.User;
import com.example.is_project2.model.Role;
import com.example.is_project2.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String displayLoginPage() {
        return "login"; // login.html should be the name of your login page template
    }

    @PostMapping("/register")
    public String processRegistration(@RequestParam String username,
                                      @RequestParam String password, Model model) {
        // Create a new user with the role of CUSTOMER
        User newUser = new User(username, password, Role.CUSTOMER);
        userRepository.save(newUser);
        return "redirect:/"; // Redirect to login page after successful registration
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password, Model model) {
        // Logic for user validation and authentication goes here
        // For simplicity, it's omitted

        return "redirect:/books"; // Redirect to the dashboard upon successful login
    }
}
