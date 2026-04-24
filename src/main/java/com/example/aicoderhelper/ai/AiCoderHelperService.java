package com.example.aicoderhelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import jakarta.annotation.Resource;


//@AiService
public interface AiCoderHelperService {


    @SystemMessage(fromResource = "system-prompt.txt")
    String  chatM(String msg);
}
