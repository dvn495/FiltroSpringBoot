package com.examenfiltro.examenfiltro.laboratory.domain.entities;

import com.examenfiltro.examenfiltro.city.domain.entities.City;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "laboratory")
@Data
@AllArgsConstructor
public class Laboratory {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="namelab")
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg", referencedColumnName = "codecity", nullable = false)
    private City codecityreg;
}