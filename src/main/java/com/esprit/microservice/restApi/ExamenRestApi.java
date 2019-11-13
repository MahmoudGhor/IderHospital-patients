package com.esprit.microservice.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservice.models.Examen;
import com.esprit.microservice.services.ExamenService;

@RestController
@RequestMapping(value = "/api/examen")
public class ExamenRestApi {
	@Autowired
	private ExamenService examenService;
	
	@GetMapping
	public ResponseEntity<Page<Examen>> getAllExamen(Pageable pageable) {
		return new ResponseEntity<Page<Examen>>(examenService.getAllExamens(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Examen> createPatient(@RequestBody Examen examen){
		return new ResponseEntity<>(examenService.addExamen(examen) , HttpStatus.OK);
	}

}
