package com.example.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    String getRegisterPage() {
        return "register";
    }

    @GetMapping("/index")
    String getIndexPage() {
        return "index";
    }
}
