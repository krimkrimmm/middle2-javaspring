package vn.scrip.middle.controller.web;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/web")
public class WebController
{

    @GetMapping("/home")
    public String home() {
        return "Welcome to Movie Management System!";
    }
}






