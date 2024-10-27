package com.exemple.etudiant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {

    @GetMapping("/") // Correspond à la route racine
    public String home() {
        return "Bienvenue sur la page d'accueil !";
    }
}




