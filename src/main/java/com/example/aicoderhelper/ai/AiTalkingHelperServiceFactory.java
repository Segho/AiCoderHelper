package com.example.aicoderhelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;

public class AiTalkingHelperService {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    private AiTalkingHelper aiTalkingHelper() {
        return AiServices.create(AiTalkingHelper.class, qwenChatModel);
    }
}
