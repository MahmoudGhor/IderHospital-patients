package com.esprit.microservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.esprit.microservice.models.Consultation;
import com.esprit.microservice.models.Examen;
import com.esprit.microservice.repository.ConsultationRepository;
import com.esprit.microservice.repository.ExamenRepository;
import com.esprit.microservice.repository.PatientRepository;
import com.esprit.microservice.repository.PersonnelRepository;

@Service
public class ConsultationService {
	@Autowired
	ConsultationRepository consultationRepository;
	@Autowired
	ExamenRepository examenRepository;
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	PersonnelRepository personnelRepository;

	public Consultation addConsultation(Consultation consultation) {
		return consultationRepository.save(consultation);
	}

	public Examen affectExamToConsultation(int idConsultation, int idExam) {
		if (consultationRepository.findById(idConsultation).isPresent()
				&& examenRepository.findById(idExam).isPresent()) {
			Examen existingExamen = examenRepository.findById(idExam).get();
			existingExamen.setConsultation(consultationRepository.findById(idConsultation).get());
			//Consultation existingConsultation = consultationRepository.findById(idConsultation).get();
			//existingConsultation.getExamens().add(examenRepository.findById(idExam).get());
			return examenRepository.save(existingExamen);
		} else {
			return null;
		}
	}

	public Page<Consultation> getAllConsultation(Pageable pageable) {
		return consultationRepository.findAll(pageable);
	}

}
