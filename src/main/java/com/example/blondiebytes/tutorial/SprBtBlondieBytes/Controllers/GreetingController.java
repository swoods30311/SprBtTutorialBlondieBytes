package com.example.blondiebytes.tutorial.SprBtBlondieBytes.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/slabatachus")
    public String getGreeting(){
        return "Dis bih Blondie Bytes on dat pizza ish";
    }
}
