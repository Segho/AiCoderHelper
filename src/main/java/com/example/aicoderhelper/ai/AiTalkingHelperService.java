package com.example.aicoderhelper.ai;

import dev.langchain4j.service.SystemMessage;

public interface AiTalkingHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String talk(String msg);
}
