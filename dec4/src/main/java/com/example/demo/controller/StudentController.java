package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController

public class StudentController {
@Autowired
 private StudentRepository repository;

@PostMapping("/post")
public Student saveStudent(@RequestBody Student student) {
	
	return repository.save(student);
}
@GetMapping("/get")
public List<Student> studentAll(){
	return repository.findAll();
}

}
