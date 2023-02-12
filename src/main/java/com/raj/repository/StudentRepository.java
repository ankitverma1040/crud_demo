package com.raj.repository;

import com.raj.binding.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentRepository extends JpaRepository<Student, Serializable> {
}
