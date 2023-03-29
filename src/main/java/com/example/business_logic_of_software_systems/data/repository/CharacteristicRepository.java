package com.example.business_logic_of_software_systems.data.repository;

import com.example.business_logic_of_software_systems.data.domain.Characteristic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CharacteristicRepository extends JpaRepository<Characteristic, Long>,
        QuerydslPredicateExecutor<Characteristic> {
}
