package com.esprit.microservice.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Patient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String image;
	private int cin;
	@Enumerated(EnumType.STRING)
	private SexePatient sexePatient;
	private String adressePatient;
	private int telephone;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Consultation> consultation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public SexePatient getSexePatient() {
		return sexePatient;
	}
	public void setSexePatient(SexePatient sexePatient) {
		this.sexePatient = sexePatient;
	}
	public String getAdressePatient() {
		return adressePatient;
	}
	public void setAdressePatient(String adressePatient) {
		this.adressePatient = adressePatient;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public List<Consultation> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
	public Patient(String nom, String prenom, String image, int cin, SexePatient sexePatient, String adressePatient,
			int telephone, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.image = image;
		this.cin = cin;
		this.sexePatient = sexePatient;
		this.adressePatient = adressePatient;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
