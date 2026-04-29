package com.example.aicoderhelper.ai;

import com.example.aicoderhelper.aitalk.AiTalkingHelperService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCoderHelperServiceTest {


    @Resource
    private AiCoderHelperService aiCoderHelperService;


    @Resource(name = "aiChat4Json")
    private AiChat4JsonService aiChat4JsonService;

    @Resource(name = "aiChat4J")
    private AiChat4JsonService aiChat4J;

    @Test
    void testChat() {
        String rst = aiCoderHelperService.chatM("say my name! which TV SHOW is this line from");
        System.out.println("AI Response: \n" + rst);
    }

    @Resource
    private AiTalkingHelperService aiTalkingHelperService;

    @Test
    void ChatFirst() {
        String rst = aiTalkingHelperService.talk("你好，fuck u");
        System.out.println("Ai" + rst);
    }

    @Test
    void ChatwithMemory() {

        String rst = aiCoderHelperService.chatM("我的名字是刘胜洪");
        System.out.println("AI Response: \n" + rst);
        rst = aiCoderHelperService.chatM("我的名字是什么你还记得吗,另外告诉你我出生身高2米1，现在28岁我身高3米6，导致我一直找不到老婆，好在身体优势让我进了一个球队，我踢的还不错");
        System.out.println("AI Response: \n" + rst);
    }

    @Test
    void chat4j() {
        String rst = aiChat4JsonService.chat4Json("我叫刘胜洪，我今年19岁，我是一个学生，我身高1米+74cm，想结婚");
        System.out.println("response:" + rst);
    }

    @Test
    void chat() {
    }

    @Test
    void chatWithMessage() {
    }
}