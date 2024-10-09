package com.qdmg.launchmty.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";  // Esto asume que tienes una vista llamada "login.html" en tu carpeta de templates
    }
}
