package com.example.springauth.controller;

import com.example.springauth.dao.UserRepository;
import com.example.springauth.dto.RegistrationFormDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public RegistrationController(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        RegistrationFormDto formDto = new RegistrationFormDto();
        model.addAttribute("registrationForm", formDto);
        return "registration";
    }

    @PostMapping("/save")
    public String processRegistration(@ModelAttribute RegistrationFormDto form) {
        userRepository.save(form.toUser(encoder));
        return "redirect:/login";
    }
}
