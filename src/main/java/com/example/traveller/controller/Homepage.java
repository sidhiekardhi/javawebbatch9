package com.example.traveller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Homepage {
	
	@GetMapping("/index")
    public String index()
    {
        return "index.html";
    }
	
	@GetMapping("/destination")
    public String destination()
    {
        return "destination.html";
    }

	@GetMapping("/pricing")
    public String pricing()
    {
        return "pricing.html";
    }
	
	@GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
	

}
