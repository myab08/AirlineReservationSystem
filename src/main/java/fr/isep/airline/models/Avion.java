package src.main.java.fr.isep.airline.models;
// Avion.java
public class Avion {
    private String immatriculation; // [cite: 39]
    private String modele;          // [cite: 40]
    private int capacite;           // [cite: 41]
    private boolean estDisponible = true;

    /** Vérifie si l'avion peut voler à l'horaire prévu [cite: 105] */
    public boolean verifierDisponibilite() {
        return estDisponible;
    }
    public boolean isEstDisponible() { return estDisponible; }

    public void affecterVol() { this.estDisponible = false; } // [cite: 42]

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public String getImmatriculation() { return immatriculation; }  
}