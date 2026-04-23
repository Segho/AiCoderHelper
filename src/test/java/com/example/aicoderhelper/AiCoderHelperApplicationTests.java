package com.example.aicoderhelper;

import com.example.aicoderhelper.ai.AiCoderHelper;
import com.example.aicoderhelper.ai.AiCoderHelperServiceImpl;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCoderHelperApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private AiCoderHelper aiCoderHelper;

    @Resource
    private AiCoderHelperServiceImpl aiCHImpl;

    @Test
    void chatM(){
        aiCHImpl.chatM("if我是你爸爸,so who you are！");
    }


    @Test
    void chat(){
        aiCoderHelper.chat("what's your name");
    }
    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("i have a dream about become a fly man to save world")
                   );
        aiCoderHelper.chatWithMessage(userMessage);
    }
}
