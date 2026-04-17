package src.main.java.fr.isep.airline;

import src.main.java.fr.isep.airline.models.*;
import src.main.java.fr.isep.airline.services.GestionCompagnie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialisation du service de gestion (notre base de données temporaire)
        GestionCompagnie systeme = new GestionCompagnie();

        System.out.println("=== Initialisation du Système de Réservation ===");

        // 1. Création des infrastructures (Aéroports et Avions)
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Terminal 2E"); //[cite: 78, 79, 80]
        Aeroport jfk = new Aeroport("John F. Kennedy", "New York", "Terminal 4"); //[cite: 78, 79, 80]
        Avion boeing = new Avion("F-GSPX", "Boeing 777", 300);// [cite: 37, 39, 40, 41]

        // 2. Création du personnel (Employés)
        Pilote pilote = new Pilote("EMP001", "Jean Dupont", "Paris", "jean@isep.fr", "P-2024", "2024-01-01", "Licence-ATPL");// [cite: 47, 68, 70]
        PerCabine cabine = new PerCabine("EMP002", "Sophie Martin", "Lyon", "sophie@isep.fr", "C-2024", "2024-02-15", "Qualification-Sécurité");// [cite: 47, 69, 71]

        // 3. Planification d'un Vol
        Vol volAF123 = new Vol("AF123", "Paris", "New York", "2026-05-12 10:00");// [cite: 43, 44, 102]
        systeme.planifierNouveauVol(volAF123); //[cite: 102]
        
        // Affectation de l'avion et de l'équipage au vol
        if (boeing.verifierDisponibilite()) {// [cite: 105]
            boeing.affecterVol();// [cite: 104]
            pilote.affecterVol(); //[cite: 100]
            cabine.affecterVol(); //[cite: 100]
            System.out.println("Équipage et avion affectés au vol " + volAF123.getNumeroVol());
        }

        // 4. Gestion d'un Passager et d'une Réservation
        Passager passagerAlice = new Passager("PASS001", "Alice Bernard", "Issy", "alice@test.com", "123456789");// [cite: 48, 52]
        systeme.ajouterPersonne(passagerAlice);//[cite: 85]

        // Alice réserve le vol AF123
        Reservation resaAlice = new Reservation("RES-001", "2026-04-17", passagerAlice, volAF123); //[cite: 51, 59, 95]
        passagerAlice.reserverVol(resaAlice); //[cite: 95]
        volAF123.ajouterPassager(passagerAlice);

        // 5. Affichage des informations (Read)
        System.out.println("\n--- Détails de la réservation ---");
        passagerAlice.obtenirInfos();   // [cite: 92]
        System.out.println("Statut de la réservation : Confirmée");// [cite: 64]
        
        System.out.println("\n--- Listing des passagers du vol ---");
        volAF123.listingPassager(); //[cite: 60]

        // 6. Bonus : Statistiques
        System.out.println("\n--- Rapport d'activité ---");
        systeme.genererRapport(); //[cite: 107, 108]
    }
}