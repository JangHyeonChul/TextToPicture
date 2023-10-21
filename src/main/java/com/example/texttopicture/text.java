package com.example.texttopicture;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = "text/plain;charset=UTF-8")
public class text {

    // http://localhost:8080/test1
    @CrossOrigin
    @GetMapping("/test1")
    public String test(@RequestParam("text") String text ) {
        System.out.println("text = " + text);

        return text;
    }


    // http://localhost:8080/test2
    @RequestMapping("/test2")
    public String test2(String id) {

        return "안녕하세요";
    }
}
