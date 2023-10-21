package com.example.texttopicture.Api.DallChat;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DallChatService {

    private final ChatgptService gptService;


    /*
    * 이미지 생성
    * prompt: 이미지 생성을 위한 프롬프트
    * */

    public String ImageGenerate(String prompt) {

        return "성공";
        // return gptService.imageGenerate(prompt);
    }
}
