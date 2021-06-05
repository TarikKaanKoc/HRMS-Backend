package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_level")
    private String languageLvl;

    @JsonIgnore
    @OneToMany(mappedBy = "language")
    private List<JobSeekerCv> jobSeekerCV;
}
