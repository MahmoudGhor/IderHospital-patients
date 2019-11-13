package com.esprit.microservice.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.Examen;
import com.esprit.microservice.repository.ExamenRepository;

@Service
public class ExamenService {
	@Autowired
	ExamenRepository examenRepositroy;
	public Examen addExamen(Examen examen) {
		return examenRepositroy.save(examen);
	}
	public Page<Examen> getAllExamens(Pageable pageable) {
		return examenRepositroy.findAll(pageable);
	}

}
