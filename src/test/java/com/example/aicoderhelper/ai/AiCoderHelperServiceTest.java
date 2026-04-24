package com.example.aicoderhelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCoderHelperServiceTest {


    @Resource
    private AiCoderHelperService aiCoderHelperService;

    @Test
    void testChat() {
        String rst = aiCoderHelperService.chatM("say my name! which TV SHOW is this line from");
        System.out.println("AI Response: \n" + rst);
    }

}