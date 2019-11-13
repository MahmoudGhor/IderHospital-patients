package com.esprit.microservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.Patient;
import com.esprit.microservice.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepositroy;

	public Patient addPatient(Patient patient) {
		return patientRepositroy.save(patient);
	}
}
