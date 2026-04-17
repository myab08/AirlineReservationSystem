package src.main.java.fr.isep.airline.models;

public class Avion {
    private String immatriculation; 
    private String modele;          
    private int capacite;          
    private boolean estDisponible = true;

    /** Vérifie si l'avion peut voler à l'horaire prévu  */
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