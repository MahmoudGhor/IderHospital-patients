package com.esprit.microservice.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.esprit.microservice.enumerations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Personnel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;

	private LocalDate dateNaissance;
	private String specialite;
	@Enumerated(EnumType.STRING)
	private Role role;

	@Enumerated(EnumType.STRING)
	private Etat etat;

	@OneToMany(mappedBy = "personnel")
	private List<Conge> conges;

	@OneToOne
	@JsonIgnore
	private Contrat contrat;

	@ManyToOne
	@JsonIgnore
	private Departement departement_personnels;

	@JsonIgnore
	@OneToMany(mappedBy = "medecin")
	private List<Consultation> consultation;
	
	public Personnel() {
		// TODO Auto-generated constructor stub
	}

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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public List<Conge> getConges() {
		return conges;
	}

	public void setConges(List<Conge> conges) {
		this.conges = conges;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Departement getDepartement_personnels() {
		return departement_personnels;
	}

	public void setDepartement_personnels(Departement departement_personnels) {
		this.departement_personnels = departement_personnels;
	}
	

	public List<Consultation> getConsultation() {
		return consultation;
	}

	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}

	@Override
	public String toString() {
		return "Personnel [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", specialite=" + specialite + ", role=" + role + "]";
	}

}
