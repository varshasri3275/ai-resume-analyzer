# AI Resume Analyzer 🚀

An **AI-based Resume Analyzer** built using **Java and Spring Boot** that automatically extracts resume content, identifies technical skills, and calculates an **ATS (Applicant Tracking System) score**.

This project demonstrates backend development using **Spring Boot, REST APIs, Apache Tika, and MySQL**, simulating how modern recruitment systems analyze resumes.

---

# Project Overview

The AI Resume Analyzer allows users to upload a resume file and automatically:

• Extract text from the resume
• Identify technical skills from the content
• Calculate an ATS score based on detected skills
• Return results through a REST API

This project showcases **backend API development and AI-inspired resume analysis logic**.

---

# Features

✔ Resume Upload API
✔ Resume Text Extraction using Apache Tika
✔ Automatic Skill Detection
✔ ATS Score Calculation
✔ RESTful API using Spring Boot
✔ File Processing with Multipart Upload
✔ Maven-based project structure

---

# Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Web
* Spring Data JPA

**Database**

* MySQL

**Libraries**

* Apache Tika (Resume Text Extraction)

**Tools**

* Maven
* IntelliJ IDEA
* Git
* Postman

---

# Project Architecture

```
ai-resume-analyzer
│
├── controller
│   └── ResumeController.java
│
├── service
│   ├── ResumeService.java
│   └── AIService.java
│
├── repository
│   └── ResumeRepository.java
│
├── model
│   └── Resume.java
│
├── util
│   └── ResumeParser.java
│
└── resources
    └── application.properties
```

---

# How It Works

1. User uploads a resume file using the API
2. Apache Tika extracts the text from the resume
3. The system scans the text for predefined technical skills
4. ATS score is calculated based on detected skills
5. The API returns extracted skills and score

---

# API Endpoint

## Upload Resume

```
POST /resume/upload
```

### URL

```
http://localhost:8080/resume/upload
```

### Request Type

```
POST
```

### Request Body

```
form-data
```

| Key  | Type | Value      |
| ---- | ---- | ---------- |
| file | File | resume.pdf |

---

# Example API Response

```
{
  "skills": [
    "Java",
    "Spring Boot",
    "MySQL",
    "MongoDB",
    "REST API",
    "Microservices",
    "HTML",
    "CSS",
    "JavaScript",
    "Git"
  ],
  "atsScore": 75,
  "resumeText": "Extracted resume content..."
}
```

---

# Setup and Installation

## 1 Clone Repository

```
git clone https://github.com/varshasri3275/ai-resume-analyzer.git
```

## 2 Navigate to Project

```
cd ai-resume-analyzer
```

## 3 Run Spring Boot Application

Using Maven:

```
mvn spring-boot:run
```

Or run the main class:

```
AiResumeAnalyzerApplication.java
```

---

# Testing the API

You can test using **Postman**.

### Steps

1. Open Postman
2. Select **POST Request**
3. Enter URL

```
http://localhost:8080/resume/upload
```

4. Go to **Body → form-data**
5. Add key:

```
file → upload resume.pdf
```

6. Click **Send**

---

# Example Skills Detected

The system currently detects common technical skills such as:

* Java
* Spring Boot
* MySQL
* MongoDB
* REST API
* Microservices
* HTML
* CSS
* JavaScript
* Git

---

# Future Improvements

Possible improvements for this project:

• NLP based skill extraction
• Machine Learning ATS scoring model
• Resume improvement suggestions
• Job matching system
• Web UI for resume upload
• Integration with job portals

---

# Author

**Varsha Sri R**
Java Full Stack Developer

LinkedIn
https://www.linkedin.com/in/varsha-sri-r-1b0445249/

GitHub
https://github.com/varshasri3275

Portfolio
https://varshasri3275.github.io/portfolio/

---

# License

This project is open-source and available for learning and educational purposes.
