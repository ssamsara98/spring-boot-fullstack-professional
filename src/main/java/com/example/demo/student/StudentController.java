package com.example.demo.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Jamila",
                        "jamila@amigoscode.edu",
                        Gender.FEMALE),
                new Student(
                        2L,
                        "Alex",
                        "alex@amigoscode.edu",
                        Gender.MALE)
        );
        log.info("students -> {}", students);
        return students;
    }
}