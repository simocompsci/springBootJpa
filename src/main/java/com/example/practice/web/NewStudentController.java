package com.example.practice.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entities.Student;
import com.example.practice.services.StudentService;

@RestController
@RequestMapping("/NewUsers")
public class NewStudentController {
    private final StudentService studentService;

    public NewStudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
    

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student newStudent = studentService.createStudent(student);
        return new ResponseEntity<>(newStudent , HttpStatus.CREATED);
    }
}
