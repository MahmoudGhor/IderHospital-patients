package com.esprit.microservice.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservice.models.Consultation;
import com.esprit.microservice.services.ConsultationService;

@RestController
@RequestMapping(value = "/api/consultation")
public class ConsultationRestApi {

	@Autowired
	private ConsultationService consultationService;

	@GetMapping
	public ResponseEntity<Page<Consultation>> getAllConsultation(Pageable pageable) {
		return new ResponseEntity<Page<Consultation>>(consultationService.getAllConsultation(pageable), HttpStatus.OK);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Consultation> createConsultation(@RequestBody Consultation consultation) {
		return new ResponseEntity<>(consultationService.addConsultation(consultation), HttpStatus.OK);
	}

	@PutMapping(value = "/{idConsultation}/{idExamen}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Consultation> setExamToConsultation(
			@PathVariable(value = "idConsultation") int idConsultation,
			@PathVariable(value = "idExamen") int idExamen) {
		return new ResponseEntity<>(consultationService.affectExamToConsultation(idConsultation, idExamen),
				HttpStatus.OK);
	}

}
