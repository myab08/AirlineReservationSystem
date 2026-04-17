package src.main.java.fr.isep.airline.services;
import java.util.*;

import src.main.java.fr.isep.airline.models.*;

public class GestionCompagnie {
    private List<Vol> vols = new ArrayList<>();
    private List<Personne> personnes = new ArrayList<>();
    private List<Avion> avions = new ArrayList<>();

    // --- CRUD PERSONNES ---
    public void ajouterPersonne(Personne p) { personnes.add(p); }
    
    public Personne chercherPersonne(String id) {
        return personnes.stream()
                .filter(p -> p.getIdentifiant().equals(id))
                .findFirst().orElse(null);
    }

    public void supprimerPersonne(String id) {
        personnes.removeIf(p -> p.getIdentifiant().equals(id));
    }

    // --- GESTION VOLS [cite: 99] ---
    public void planifierNouveauVol(Vol v) {
        vols.add(v);
        v.planifierVol();
    }

    /** Affecte un avion si disponible [cite: 104, 105] */
    public void affecterAppareil(Vol v, Avion a) {
        if (a.verifierDisponibilite()) {
            a.affecterVol();
            System.out.println("Avion " + a.getImmatriculation() + " affecté au vol " + v.getNumeroVol());
        } else {
            System.out.println("L'avion n'est pas disponible.");
        }
    }

    // --- BONUS : STATISTIQUES [cite: 107] ---
    public void genererRapport() {
        System.out.println("Nombre total de vols : " + vols.size());
    }
}