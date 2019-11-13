package com.esprit.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservice.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
