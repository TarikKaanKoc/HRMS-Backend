package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "workplaces")
@Data
@NoArgsConstructor @AllArgsConstructor

public class WorkPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "workplace_name")
    private String workplaceName;

    @Column(name = "workplace_positions")
    private String workplacePositions;

    @Column(name = "first_year")
    private LocalDate firstYear;

    @Column(name = "end_year")
    private LocalDate  endYear;

    @JsonIgnore
    @OneToMany(mappedBy = "workPlace")
    private List<JobSeekerCv> jobSeekerCV;
}
