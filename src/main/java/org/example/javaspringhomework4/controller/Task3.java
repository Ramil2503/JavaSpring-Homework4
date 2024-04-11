package org.example.javaspringhomework4.controller;

import lombok.AllArgsConstructor;
import org.example.javaspringhomework4.model.User;
import org.example.javaspringhomework4.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class Task3 {
    private final UserRepository userRepository;

    @GetMapping("/task3")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.getUserList());
        return "task3";
    }

    @PostMapping("/task3")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        userRepository.addUser(user);
        model.addAttribute("users", userRepository.getUserList());
        return "task3";
    }
}
