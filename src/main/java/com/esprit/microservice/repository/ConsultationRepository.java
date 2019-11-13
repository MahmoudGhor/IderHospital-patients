package com.esprit.microservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservice.models.*;
@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
	Page<Consultation> findAll(Pageable pageable);

}
