package com.example.aicoderhelper.ai;

import dev.langchain4j.service.SystemMessage;

public interface AiTalkingHelper {

    @SystemMessage
    String talk(String msg);
}
