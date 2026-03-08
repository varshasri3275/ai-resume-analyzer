package com.example.ai_resume_analyzer.util;

import org.apache.tika.Tika;
import java.io.File;

public class ResumeParser {

    public static String extractText(File file) throws Exception {

        Tika tika = new Tika();
        return tika.parseToString(file);

    }

}