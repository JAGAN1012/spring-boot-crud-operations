package com.project.restapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.restapi.Entity.Student;
// Make sure to import the Student entity
import com.project.restapi.repository.StudentRepository;

@RestController
public class StudentController {

    // Inject the StudentRepository
    @Autowired
    private StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        // Fetch all students from the database
        return repo.findAll();
    }
    
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        // Fetch the student from the database
        Student student = repo.findById(id)
                              .orElseThrow(() -> new RuntimeException("Student not found"));

        return ResponseEntity.ok(student); // Return the student --------------------------------------------------------------------------with a 200 OK status
    
}
    @PostMapping("/students/add")
    @ResponseStatus(code=HttpStatus.CREATED)
    public void createstudent(@RequestBody Student student) {
    	repo.save(student);
    }
    @PutMapping("/students/update/{id}")
    public Student updatestudent(@PathVariable int id) {
    	Student student = repo.findById(id).get();
    	student.setName("parasaath");
    	student.setBranch("cse");
    	student.setPercentage(85);	
    	
    	 repo.save(student);
    	 return student;
    	
    }
    @DeleteMapping("/students/delete/{id}")
    
    public void removestudent(@PathVariable int id) {
    	Student student =repo.findById(id).get();
    	repo.delete(student);
    	
    }
    
}