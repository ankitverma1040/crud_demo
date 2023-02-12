package com.raj.service;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;

public interface StudentService {

    public Student createNewStudent(StudentDto studentDto);
}
