package com.qdmg.launchmty.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String showMenu(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        String role = auth.getAuthorities().stream().findFirst().orElse(null).getAuthority();

        model.addAttribute("nombre", username);
        model.addAttribute("rol", role.replace("ROLE_", ""));

        return "menu";
    }
}
