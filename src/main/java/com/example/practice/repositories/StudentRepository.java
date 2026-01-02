package com.example.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {
    // this interface we created is what talks directly to the database 
    // and gives you plenty of predefined methods 
    // like: save() findAll() findById() deleteById()...

    // Important : we shouldn't implement this interface because spring implements it automaticaly at runtime

}
