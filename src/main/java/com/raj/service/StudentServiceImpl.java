package com.raj.service;

import com.raj.binding.Student;
import com.raj.dto.StudentDto;
import com.raj.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Student> getAllStudent() {

        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> byId = studentRepository.findById(id);
        if(byId.isPresent()){
            Student student = byId.get();
            return student;
        }else
           throw new RuntimeException("Invalid id...!");
    }

    @Override
    public boolean isPrime(Integer number) {
        if (number<=1){
            return false;
        }
        for (int i = 2; i <number/2 ; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    @Override
    public String deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
        return "Student deleted id : "+id;
    }


}
