package com.esprit.microservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.Personnel;
import com.esprit.microservice.repository.PersonnelRepository;



@Service
public class PersonnelService {

	@Autowired
	PersonnelRepository personnelRepository;

	public Personnel ajouterPersonnel(Personnel personnel) {
		return personnelRepository.save(personnel);
	}

	public Page<Personnel> getAllPersonnel(Pageable pageable) {
		return personnelRepository.findAll(pageable);
	}

	

	public Optional<Personnel> getPersonnelById(int idPersonnel) {
		return personnelRepository.findById(idPersonnel);
	}

	public void deletePersonnel(int idPersonnel) {
		personnelRepository.deleteById(idPersonnel);
	}

}
