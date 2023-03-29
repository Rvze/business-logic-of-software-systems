package com.example.business_logic_of_software_systems.data.repository;

import com.example.business_logic_of_software_systems.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ProductRepository extends JpaRepository<Product, Long>,
        QuerydslPredicateExecutor<Product> {
}
