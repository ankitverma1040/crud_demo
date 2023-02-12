package com.raj.service;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public Student createNewStudent(StudentDto studentDto);

    public List<Student> getAllStudent();

    public Student getStudentById(Integer id);

    public boolean isPrime(Integer number);

    public String deleteStudentById(Integer id);


}
