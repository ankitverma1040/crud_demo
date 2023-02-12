package com.raj.controller;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;
import com.raj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    public ResponseEntity<Student> createStudentData(@RequestBody StudentDto studentDto){
        Student response = studentService.createNewStudent(studentDto);
        return  new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
