package com.koc.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name="job_advertisements")

public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "city_id" )
    private City city;


    @ManyToOne()
    @JoinColumn(name = "employer_id" )
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "job_title_id" )
    private JobTitle jobTitle;

    @Column(name = "quota" )
    private int quota;

    @Column(name = "max_salary")
    private Double maxSalary;

    @Column(name = "min_salary")
    private Double minSalary;


    @Column(name = "description" , length = 30000)
    @Type(type = "text")
    private String description;


    @Column(name = "created_at" )
    private LocalDateTime creatAt;

    @Column(name = "enable")
    private boolean enable ;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;
}


