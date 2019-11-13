package com.esprit.microservice.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Departement implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    @OneToMany(mappedBy="departement_personnels",cascade= CascadeType.ALL)
    private Set<Personnel> personnels = new HashSet<Personnel>();
    public Departement() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(Set<Personnel> personnels) {
        this.personnels = personnels;
    }
}
