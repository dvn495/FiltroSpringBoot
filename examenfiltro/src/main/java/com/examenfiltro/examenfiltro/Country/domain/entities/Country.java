package com.examenfiltro.examenfiltro.Country.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @Column(name = "codecountry")
    private String codecountry;

    @Column(name="namecountry")
    private String namecountry;
}
