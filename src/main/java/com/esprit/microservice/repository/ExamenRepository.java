package com.esprit.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservice.models.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

}
