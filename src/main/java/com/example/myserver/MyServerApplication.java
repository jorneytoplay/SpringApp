package com.example.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class MyServerApplication {

    public static void main(String[] args) throws IOException{
        SpringApplication.run(MyServerApplication.class, args);
    }
    @EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        System.out.println("Application started ... launching browser now");
        openHomePage();
    }
    private static void openHomePage() {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("open http://localhost:8080/login");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
