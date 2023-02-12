package com.raj.service;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;
import com.raj.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createNewStudent(StudentDto studentDto) {
        Student student=new Student();

        BeanUtils.copyProperties(studentDto,student);
//        student.setFName(studentDto.getFName());
//        student.setLName(studentDto.getLName());
//        student.setDob(studentDto.getDob());
//        student.setMobile(studentDto.getMobile());
        Student save = studentRepository.save(student);
        return save;
    }
}
