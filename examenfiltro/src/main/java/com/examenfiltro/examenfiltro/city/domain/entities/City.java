package com.examenfiltro.examenfiltro.city.domain.entities;

import com.examenfiltro.examenfiltro.region.domain.entities.Region;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="city")
@Data
public class City {
    @Id
    @Column(name = "codecity")
    private String codecity;

    @Column(name = "namecity")
    private String namecity;

    @ManyToOne
    @JoinColumn(name = "coderegcity",  nullable = false)
    private Region coderegcity;


}