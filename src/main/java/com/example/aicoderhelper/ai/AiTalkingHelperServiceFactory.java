package com.example.aicoderhelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiTalkingHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    public AiTalkingHelperService aiTalkingHelperService() {
        return AiServices.create(AiTalkingHelperService.class, qwenChatModel);
    }
}
