package com.example.texttopicture;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Tag( name = "posts", description = "테스트용 API")
@RestController
@RequestMapping("/api")
public class text {

    // http://localhost:8080/api/testapi/test2
    @CrossOrigin
    @GetMapping("/test2")
    public String test(@RequestParam("text") String text ) {
        System.out.println("text = " + text);

        return text;
    }


    // http://localhost:8080/test2
    @CrossOrigin
    @GetMapping("/test2")
    public String test2() {

        return "안녕하세요";
    }

    // 기능1
}
