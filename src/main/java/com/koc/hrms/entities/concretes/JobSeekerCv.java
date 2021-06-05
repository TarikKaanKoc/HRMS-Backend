package com.koc.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "job_seeker_cv")
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor

public class JobSeekerCv {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "description" )
    private String description;

    @Column(name = "cv_photo_url")
    private String cvPhotoUrl;

    @ManyToOne()
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne()
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne()
    @JoinColumn(name = "social_media_id")
    private SocialMedia socialMedia;

    @ManyToOne()
    @JoinColumn(name = "workplace_id")
    private WorkPlace workPlace;

    @ManyToOne()
    @JoinColumn(name = "abilities_id")
    private Ability ability;



}
