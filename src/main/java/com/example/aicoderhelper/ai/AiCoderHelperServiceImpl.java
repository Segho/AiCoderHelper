package com.example.aicoderhelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AiCoderHelperServiceImpl implements AiCoderHelperService {


    @Resource
    private ChatModel qwenChatmodel;

    @Override
    public String chatM(String msg) {
        UserMessage userMessage = UserMessage.from(msg);
        ChatResponse chatResponse = qwenChatmodel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("Impl response: \n" + aiMessage.text());
        return "";
    }
}
