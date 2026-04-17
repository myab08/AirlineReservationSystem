package src.main.java.fr.isep.airline.models;

public class Aeroport {
    private String code;
    private String nom;  
    private String ville;

    public Aeroport(String code, String nom, String ville) {
        this.code = code;
        this.nom = nom;
        this.ville = ville;
    }

    public String getCode() { return code; }
    public String getNom() { return nom; }
    public String getVille() { return ville; }

    public void afficherInfo() {
        System.out.println("Aéroport: " + nom + " (" + code + ") - " + ville); // [cite: 86]
    }
    
}
