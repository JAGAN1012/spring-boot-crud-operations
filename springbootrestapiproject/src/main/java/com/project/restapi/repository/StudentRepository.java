package com.project.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restapi.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    // You can add custom query methods here if needed
}