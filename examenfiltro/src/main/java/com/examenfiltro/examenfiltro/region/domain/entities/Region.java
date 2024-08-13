package com.examenfiltro.examenfiltro.region.domain.entities;

import com.examenfiltro.examenfiltro.Country.domain.entities.Country;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "region")
@Data
public class Region {
    @Id
    @Column(name = "codereg")
    private String codereg;

    @Column(name="namereg")
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountryregion",  nullable = false)
    private Country codecountryregion;
}





















































