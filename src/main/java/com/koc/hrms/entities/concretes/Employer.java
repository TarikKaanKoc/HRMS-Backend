package com.koc.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@NoArgsConstructor @AllArgsConstructor

public class Employer extends User{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAdres;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "enable")
    private boolean enable;

    @JsonIgnore
    @OneToMany(mappedBy = "employer" )
    private List<JobAdvertisement> jobAdvertisements;
}
