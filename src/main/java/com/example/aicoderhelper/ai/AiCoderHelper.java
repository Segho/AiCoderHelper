package com.example.aicoderhelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AiCoderHelper {

    @Resource
    private ChatModel qwenChatModel;

    private static final String SYSTEM_MESSAGE= """
            你是一个语法纠错大师，我会和你用中文或者英文对话，
            当我提问中文（如：解释一下这个用法），你按照如下格式回答我
            1.对应英文提问（explain this usage）
            2.英文回答（this usage usually...）
            3.句子成分分析
                主语省略（please）
                谓语：explain 解释、说明
                宾语：this usage
            4.类似三个例句
            
            当我问出英文问题（如 pls help me explain this usage to me），你按照如下格式
            1.语法纠错后的提问（Please explain this usage to me./Please help me explain this usage.）
            2.指出错误详情（help me 和 to me语义重复,常用说法为...）
            3.句子成分分析
                主语省略（please）
                谓语：explain 解释、说明
                宾语：this usage
            4.类似三个例句
            """;


    public String chat(String msg) {
        UserMessage userMessage = UserMessage.from(msg);
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI Response:" + aiMessage.toString());
        return aiMessage.text();
    }

    public String chatWithMessage(UserMessage userMessage) {
        SystemMessage systemMessage=SystemMessage.from(SYSTEM_MESSAGE);
        ChatResponse chatResponse = qwenChatModel.chat(systemMessage,userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI response:" + aiMessage);
        return aiMessage.text();
    }
}
