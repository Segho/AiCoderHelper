package com.example.aicoderhelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AiCoderHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModal;

    @Bean
    public AiCoderHelperService aiCoderHelperService(){
        return AiServices.create(AiCoderHelperService.class,qwenChatModal);
    }
}
