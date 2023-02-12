package com.raj.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDto {
    private Integer sid;
    private String fName;
    private String lName;
    private Long mobile;
    private LocalDate dob;
}
