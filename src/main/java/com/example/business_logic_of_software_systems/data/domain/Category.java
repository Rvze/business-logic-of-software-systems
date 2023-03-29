package com.example.business_logic_of_software_systems.data.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_category_id_seq")
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}
