package com.example.ai_resume_analyzer.controller;

import com.example.ai_resume_analyzer.service.ResumeService;
import com.example.ai_resume_analyzer.util.ResumeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/upload")
    public Map<String,Object> uploadResume(@RequestParam("file") MultipartFile file) throws Exception {

        File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + file.getOriginalFilename());

        file.transferTo(convFile);

        String text = ResumeParser.extractText(convFile);

        List<String> skills = resumeService.extractSkills(text);

        int atsScore = resumeService.calculateATSScore(skills);

        Map<String,Object> response = new HashMap<>();

        response.put("skills", skills);
        response.put("atsScore", atsScore);
        response.put("resumeText", text);

        return response;
    }
}