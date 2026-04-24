package com.example.aicoderhelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCoderHelperServiceTest {


    @Resource
    private AiCoderHelperService aiCoderHelperService;

    @Test
    void testChat() {
        String rst = aiCoderHelperService.chatM("say my name! which TV SHOW is this line from");
        System.out.println("AI Response: \n" + rst);
    }g

    @Resource
    private AiTalkingHelperService aiTalkingHelperService;

    @Test
    void ChatFirst() {
        String rst= aiTalkingHelperService.talk("你好，fuck u");
        System.out.println("Ai" + rst);
    }

    @Test
    void ChatwithMemory() {

        String rst = aiCoderHelperService.chatM("我的名字是刘胜洪");
        System.out.println("AI Response: \n" + rst);
        rst = aiCoderHelperService.chatM("我的名字是什么你还记得吗");
        System.out.println("AI Response: \n" + rst);
    }

}