package com.andrei.springaillama3.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.stereotype.Service;

@Service
public class LlamaAIService {

    private final OllamaChatModel chatModel;

    public LlamaAIService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String generateResult(String promptMessage) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        promptMessage,
                        OllamaOptions.create()
                                .withModel("llama3")
                ));
        return response.getResult().getOutput().getContent();
    }
}
