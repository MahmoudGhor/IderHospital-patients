package com.esprit.microservice.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservice.models.Patient;
import com.esprit.microservice.services.PatientService;

@RestController
@RequestMapping(value = "/api/patient")
public class PatientRestApi {
	@Autowired
	private PatientService patientService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient){
		return new ResponseEntity<>(patientService.addPatient(patient) , HttpStatus.OK);
	}

}
