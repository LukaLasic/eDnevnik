package com.example.ednevnik.controller;

import com.example.ednevnik.model.Student;
import com.example.ednevnik.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        List<Student> listStudents = studentRepository.findAll();
        model.addAttribute("students", listStudents);
        return "students";
    }

}
