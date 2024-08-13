package com.examenfiltro.examenfiltro.medicine.domain.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="medicine")
@Data
@AllArgsConstructor
public class Medicine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "proceedings")
    private String proceedings;

    @Column(name = "namemedicine")
    private String namemedicine;

    @Column(name = "healthregister")
    private String healthregister;

    @Column(name = "description")
    private String description;

    @Column(name = "descriptionshort")
    private String descriptionshort;

}
