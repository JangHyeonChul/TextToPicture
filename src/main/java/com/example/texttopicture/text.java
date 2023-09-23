package com.example.texttopicture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class text {

    @GetMapping("/")
    public String test() {
        System.out.println(" = ");
        return "dkssud";
    }
}
