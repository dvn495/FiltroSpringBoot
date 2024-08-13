package com.examenfiltro.examenfiltro.customer.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import com.examenfiltro.examenfiltro.city.domain.entities.City;

@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
public class Customer {
    @Id
    @Column(name = "idcustomer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size()
    private Long id;

    @Column(name = "namecustomer")
    private String namecustomer;

    
    @Column(name = "lastnamecustomer")
    private String lastnamecustomer;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer", referencedColumnName = "codecity", nullable = false)
    private City codecitycustomer;

    @Column(name = "emailcustomer")
    private String emailcustomer;

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @Column(name = "lon")
    private Float lon;

    @Column(name = "latitud")
    private Float latitud;


}
