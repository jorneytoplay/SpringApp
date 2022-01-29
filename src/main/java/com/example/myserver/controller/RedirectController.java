package com.example.myserver.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectController {

    @GetMapping("/welcome")
    public String defaultAfterLogin(HttpServletRequest request, Model model) {
        if (request.isUserInRole("ROLE_ADMIN")) {
            return "redirect:/admin/welcomeAdmin";
        }
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String nickname = auth.getName();
        //Вывести имя пользователя
        model.addAttribute("nickname",nickname);
        return "welcome";
    }
}
