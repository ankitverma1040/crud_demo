package com.raj.controller;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;
import com.raj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    public ResponseEntity<Student> createStudentData(@RequestBody StudentDto studentDto){
        Student student = studentService.createNewStudent(studentDto);
        return  new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/allstudent")
    public ResponseEntity<List<Student>> allStudent(){
        List<Student> allStudent = studentService.getAllStudent();
        return new ResponseEntity<>(allStudent,HttpStatus.FOUND);

    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Student> getStudentByHisId(@PathVariable Integer id){
        Student studentById = studentService.getStudentById(id);
        return new ResponseEntity<>(studentById,HttpStatus.FOUND);

    }
    @GetMapping("/isprime/{number}")
    public ResponseEntity<String> isPrimeOrNot(@PathVariable Integer number){
        boolean prime = studentService.isPrime(number);
        if (prime){
            return new ResponseEntity<>("Prime Number",HttpStatus.OK);
        }else
            return new ResponseEntity<>("Not Prime",HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
        String response = studentService.deleteStudentById(id);
        return new ResponseEntity<>(response,HttpStatus.GONE);
    }


}
