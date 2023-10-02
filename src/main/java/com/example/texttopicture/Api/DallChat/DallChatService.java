package com.example.texttopicture.Api.DallChat;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.springframework.stereotype.Service;

@Service
public class DallChatService {

    private final ChatgptService gptService;

    public DallChatService(ChatgptService gptService) {
        this.gptService = gptService;
    }

    /*
    * 이미지 생성
    * prompt: 이미지 생성을 위한 프롬프트
    * */
    public String ImageGenerate(String prompt) {

        return gptService.imageGenerate(prompt);
    }
}
