package com.example.texttopicture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class text {

    @CrossOrigin
    @GetMapping("/test")
    public String test(@RequestParam("text") String text) {
        System.out.println("text = " + text);

        return text;
    }

    @GetMapping("/text2")
    public String test2() {


        return "안녕하세요";
    }
}
