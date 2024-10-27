package com.exemple.etudiant;

import java.util.ArrayList;
import java.util.List;

class Etudiant {
    private Long id;
    private String nom;
    private List<Note> notes; // Association avec la classe Note

    // Constructeur
    public Etudiant(Long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.notes = new ArrayList<>(); // Initialisation de la liste des notes
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void ajouterNote(Note note) {
        this.notes.add(note); // Méthode pour ajouter une note à l'étudiant
    }
}
