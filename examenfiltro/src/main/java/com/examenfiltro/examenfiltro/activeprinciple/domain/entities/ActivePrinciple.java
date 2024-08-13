package com.examenfiltro.examenfiltro.activeprinciple.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "activeprinciple")
@Data
@AllArgsConstructor
public class ActivePrinciple {
    @Id
    @Column(name = "idap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idao;

    @Column(name="nameap")
    private String nameap;

}
