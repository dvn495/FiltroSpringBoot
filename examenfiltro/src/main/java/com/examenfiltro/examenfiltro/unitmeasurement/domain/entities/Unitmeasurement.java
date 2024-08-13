package com.examenfiltro.examenfiltro.unitmeasurement.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "unitmeasurement")
@Data
@AllArgsConstructor
public class Unitmeasurement {
    @Id
    @Column(name = "idum")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idum;

    @Column(name="nameum")
    private String nameum;
}
