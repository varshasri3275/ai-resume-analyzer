package com.example.ai_resume_analyzer.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ResumeService {

    public List<String> extractSkills(String text){

        List<String> skills = new ArrayList<>();

        String[] skillKeywords = {
                "Java",
                "Spring Boot",
                "MySQL",
                "MongoDB",
                "REST API",
                "Microservices",
                "Docker",
                "Kubernetes",
                "AWS",
                "HTML",
                "CSS",
                "JavaScript",
                "Git"
        };

        for(String skill : skillKeywords){
            if(text.toLowerCase().contains(skill.toLowerCase())){
                skills.add(skill);
            }
        }

        return skills;
    }

    // ⭐ ADD THIS METHOD HERE
    public int calculateATSScore(List<String> skills) {

        int totalSkills = 12;
        int score = (skills.size() * 100) / totalSkills;

        return score;
    }

}