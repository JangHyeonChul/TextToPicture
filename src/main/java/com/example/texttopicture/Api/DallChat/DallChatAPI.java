package com.example.texttopicture.Api.DallChat;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/image")
public class DallChatAPI {

    private final DallChatService chatService;

    /*
    이미지 생성 API
    */
    @GetMapping("/generate")
    @CrossOrigin
    public String DallImageGenerate(String prompt) {

        return chatService.ImageGenerate(prompt);
    }
}
