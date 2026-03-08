package com.example.ai_resume_analyzer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AIService {

    public String analyzeResume(String text) {

        String prompt = "Analyze this resume and give ATS score and suggestions:\n" + text;

        // Send to AI API (simplified)
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.postForObject(
                "https://api.openai.com/v1/chat/completions",
                prompt,
                String.class
        );

        return response;
    }
}