package com.example.aicoderhelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.chat.request.json.JsonObjectSchema;
import dev.langchain4j.model.chat.request.json.JsonSchema;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static dev.langchain4j.model.chat.request.ResponseFormatType.JSON;

@Configuration
public class AiChat4JsonServiceFactory {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    public AiChat4JsonService aiChat4J() {
        ResponseFormat responseFormat = ResponseFormat.builder()
                .type(JSON)
                .jsonSchema(JsonSchema.builder()
                        .name("Person")
                        .rootElement(JsonObjectSchema.builder()
                                .addStringProperty("name")
                                .addIntegerProperty("age")
                                .addNumberProperty("height")
                                .addBooleanProperty("married")
                                .required("name", "age", "height", "married")
                                .build())
                        .build())
                .build();

        return AiServices.builder(AiChat4JsonService.class)
                .chatModel(qwenChatModel)
                .build();
    }
}
