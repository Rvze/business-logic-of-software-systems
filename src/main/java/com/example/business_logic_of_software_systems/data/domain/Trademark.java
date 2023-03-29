package com.example.business_logic_of_software_systems.data.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "trademark")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Trademark {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trademark_trademark_id_seq")
    @Column(name = "trademark_id")
    private Long trademarkId;

    @Column(name = "trademakr_name")
    private String trademarkName;

    @OneToMany(mappedBy = "productId")
    private Set<Product> products;
}
