package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "job_titles")
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor

public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy = "jobTitle")
    private List<JobAdvertisement> jobAdvertisements;
}
