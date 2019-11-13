package com.esprit.microservice.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Examen> createPatient(@RequestBody Examen examen){
		return new ResponseEntity<>(examenService.addExamen(examen) , HttpStatus.OK);
	}

}
