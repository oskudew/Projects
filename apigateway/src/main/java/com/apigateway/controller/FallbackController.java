package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/Usermsfallback")
    public String usermsfallback(){
        return "UserMS is down in this time!!";
    }
    @GetMapping("/Contactmsfallback")
    public String Contactmsfallback(){
        return "ContactMS is down in this time!!";
    }
}
