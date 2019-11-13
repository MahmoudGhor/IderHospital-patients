package com.esprit.microservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservice.models.Personnel;



@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {
	
	Page<Personnel> findAll(Pageable pageable);

}
