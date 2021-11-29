package com.example.elective.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Elective {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long electiveId;
    private String electiveName;
    private String electiveDepartment;
    private int electiveCredits;

    public void setElectiveId(Long electiveId) {
        this.electiveId = electiveId;
    }

    public void setElectiveName(String electiveName) {
        this.electiveName = electiveName;
    }

    public void setElectiveDepartment(String electiveDepartment) {
        this.electiveDepartment = electiveDepartment;
    }

    public void setElectiveCredits(int electiveCredits) {
        this.electiveCredits = electiveCredits;
    }

    public Long getElectiveId() {
        return this.electiveId;
    }

    public String getElectiveName() {
        return this.electiveName;
    }

    public String getElectiveDepartment() {
        return this.electiveDepartment;
    }

    public int getElectiveCredits() {
        return this.electiveCredits;
    }
    
}