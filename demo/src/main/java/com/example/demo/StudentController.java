package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/students", version = "1")
public class StudentController {

    @GetMapping()
    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        1, "Tom", 20
                ),
                new Student(
                        2, "Donald", 21
                ),
                new Student(
                        3, "Caleb", 34
                )
        );
    }
}
