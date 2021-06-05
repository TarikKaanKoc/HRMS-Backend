package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "social_media")
@Data
@NoArgsConstructor @AllArgsConstructor
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "link")
    private String link;

    @Column(name = "link_type")
    private String linkType;

    @JsonIgnore
    @OneToMany(mappedBy = "socialMedia" )
    private List<JobSeekerCv> jobSeekerCV;

}
