package com.example.texttopicture.Api.DallChat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DallChatAPI {

    @Autowired
    private DallChatService dallChatService;


    @GetMapping("/image")
    public String asdf() {

        return dallChatService.ImageGenerate("안녕");
    }
}
