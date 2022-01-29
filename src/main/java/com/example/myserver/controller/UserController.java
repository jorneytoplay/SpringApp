package com.example.myserver.controller;

import com.example.myserver.entity.User;
import com.example.myserver.service.UserServiceImpl;
import com.example.myserver.validator.UserValidator;
import com.example.myserver.service.SecurityService;
import com.example.myserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private SecurityService securityService;
    @Autowired
    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("userForm",new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userform, BindingResult bindingResult, Model model){
        userValidator.validate(userform, bindingResult);

        if(bindingResult.hasErrors()){
            return "registration";
        }
        System.out.printf(String.valueOf(userform));
        userService.save(userform);

        securityService.autoLogin(userform.getUsername(),userform.getConfirmPassword());

        return "redirect:/welcome";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }





    @GetMapping("/admin")
    public String admin(Model model){
        return "admin";
    }

}
