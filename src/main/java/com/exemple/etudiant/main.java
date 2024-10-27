package com.exemple.etudiant;

class Main {
    public static void main(String[] args) {
        // Création d'un étudiant
        Etudiant etudiant = new Etudiant(1L, "Alice");

        // Création de notes
        Note note1 = new Note(1L, 15.0, "Math");
        Note note2 = new Note(2L, 12.5, "Science");

        // Ajout des notes à l'étudiant
        etudiant.ajouterNote(note1);
        etudiant.ajouterNote(note2);

        // Affichage des informations de l'étudiant et de ses notes
        System.out.println("Étudiant : " + etudiant.getNom());
        for (Note note : etudiant.getNotes()) {
            System.out.println("Note en " + note.getMatiere() + " : " + note.getValeur());
        }
    }
}

