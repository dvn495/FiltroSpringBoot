package com.examenfiltro.examenfiltro.Country.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "region")
@Data
@AllArgsConstructor
public class Country {
    @Id
    @Column(name = "codecountry")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codecountry;

    @Column(name="namecountry")
    private String namecountry;
}
