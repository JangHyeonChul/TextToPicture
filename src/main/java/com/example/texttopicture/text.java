package com.example.texttopicture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class text {

    // http://localhost:8080/test
    @CrossOrigin
    @GetMapping("/test")
    public String test(@RequestParam("text") String text ) {
        System.out.println("text = " + text);

        return text;
    }

    @CrossOrigin
    // http://localhost:8080/test2
    @GetMapping("/test2")
    public String test2() {


        return "안녕하세요";
    }
}
