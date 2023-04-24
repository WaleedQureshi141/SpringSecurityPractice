package com.example.SpringSecurity2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AppController
{
    @GetMapping("/public")
    public String publicUser()
    {
        return "<HTML><H1>Public User Page</H1></HTML>";
    }

    @GetMapping("/admin")
    public String adminUser()
    {
        return "<HTML><H1>Admin User Page</H1></HTML>";
    }

    @GetMapping("/normal")
    public String normalUser()
    {
        return "<HTML><H1>Normal User Page</H1></HTML>";
    }
}
