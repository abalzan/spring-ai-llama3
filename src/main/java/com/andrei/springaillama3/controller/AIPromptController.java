package com.andrei.springaillama3.controller;

import com.andrei.springaillama3.service.LlamaAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIPromptController {

    private final LlamaAIService llamaAIService;

    public AIPromptController(LlamaAIService llamaAIService) {
        this.llamaAIService = llamaAIService;
    }

    @GetMapping("/api/v1/generate")
    public String generateAIPrompt(@RequestParam String promptMessage) {
        return llamaAIService.generateResult(promptMessage);
    }
}
