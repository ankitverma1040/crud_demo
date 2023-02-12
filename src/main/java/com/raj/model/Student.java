package com.raj.binding;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "STUDENT_INFO")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private Integer sid;
    @Column(name = "FIRST_NAME")
    private String fName;
    @Column(name ="LAST_NAME" )
    private String lName;
    @Column(name = "MOBILE")
    private Long mobile;
    @Column(name = "DOB")
    private LocalDate dob;

    @CreationTimestamp
    private LocalDate createdDate;

    @UpdateTimestamp
    private LocalDate updatedDate;
}
