package com.example.myserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pingpong")
public class WebSocketController {

    @GetMapping
    public String pingPong(){
        return "pingpong";
    }
}
