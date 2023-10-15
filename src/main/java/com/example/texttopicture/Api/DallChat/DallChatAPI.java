package com.example.texttopicture.Api.DallChat;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public String DallImageGenerate(String prompt) throws IOException {
        String imagePath = "http://localhost:8080/img/20162929.jpg";

        return imagePath;
    }
}
