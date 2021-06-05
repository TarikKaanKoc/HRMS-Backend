package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "schools")
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "school_department")
    private String shoolDepertment;

    @Column(name = "first_year")
    private LocalDate firstYear;

    @Column(name = "end_year")
    private LocalDate endYear;

    @JsonIgnore
    @OneToMany(mappedBy = "school")
    private List<JobSeekerCv> jobSeekerCV;
}
