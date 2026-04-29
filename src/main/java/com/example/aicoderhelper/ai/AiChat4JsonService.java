package com.example.aicoderhelper.ai;

import dev.langchain4j.service.SystemMessage;

public interface AiChat4JsonService {

    @SystemMessage(fromResource = "system-prompt-json.txt")
    String chat4Json(String msg);
}
