package com.example.elective.repository;

import com.example.elective.entity.Elective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectiveRepository extends JpaRepository<Elective, Long> {

    Elective findByElectiveId(Long electiveId);
}