package com.example.practice.services;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.practice.entities.Student;
import com.example.practice.repositories.StudentRepository;


// we use the service to put the business logic in here and the controller stays clean
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    // this is the DI we talked about using constructor injection
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }
    
    public Student updateStudent(Long id, Student newData){
        Student student = new Student();
        student.setName(newData.getName());
        student.setEmail(newData.getEmail());
        return studentRepository.save(student);
    }
    
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
