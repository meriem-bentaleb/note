package com.exemple.etudiant;

import org.springframework.data.jpa.repository.JpaRepository;

interface NoteRepository extends JpaRepository<Note, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}




