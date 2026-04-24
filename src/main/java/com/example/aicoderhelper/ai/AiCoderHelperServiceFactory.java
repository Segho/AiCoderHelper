package com.example.aicoderhelper.ai;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiCoderHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModal;

    @Bean
    public AiCoderHelperService aiCoderHelperService() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        AiCoderHelperService aiCoderHelperService = AiServices.builder(AiCoderHelperService.class)
                .chatModel(qwenChatModal)
                .chatMemory(chatMemory) //session memory
                .build();

        return aiCoderHelperService;
    }
}
