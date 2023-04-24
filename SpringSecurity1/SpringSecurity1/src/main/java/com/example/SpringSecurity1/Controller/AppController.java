package com.example.SpringSecurity1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/auth")
public class AppController
{
    @GetMapping("/process")
    public String process()
    {
        return "passed spring security through db";
    }
}
