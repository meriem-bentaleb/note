package com.exemple.etudiant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
 class EtudiantService {
    private final List<Etudiant> etudiants = new ArrayList<>();

    // Ajouter un étudiant
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    // Obtenir tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    // Obtenir un étudiant par son ID
    public Optional<Etudiant> getEtudiantById(Long id) {
        return etudiants.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    // Mettre à jour un étudiant
    public Optional<Etudiant> updateEtudiant(Long id, Etudiant etudiantDetails) {
        Optional<Etudiant> optionalEtudiant = getEtudiantById(id);
        if (optionalEtudiant.isPresent()) {
            Etudiant etudiant = optionalEtudiant.get();
            etudiant.setNom(etudiantDetails.getNom());
            return Optional.of(etudiant);
        }
        return Optional.empty();
    }

    // Supprimer un étudiant
    public void deleteEtudiant(Long id) {
        etudiants.removeIf(e -> e.getId().equals(id));
    }
}

