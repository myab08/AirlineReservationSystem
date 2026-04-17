package src.main.java.fr.isep.airline.models;


import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String etat;
    private List<Passager> passagers = new ArrayList<>();

    public Vol(String num, String org, String dest, String date) {
        this.numeroVol = num;
        this.origine = org;
        this.destination = dest;
        this.dateHeureDepart = date;
        this.etat = "PLANIFIÉ";
    }

    public void planifierVol() { System.out.println("Vol " + numeroVol + " planifié."); }
    public void annulerVol() { this.etat = "ANNULÉ"; }
    public void listingPassager() { 
        System.out.println("Passagers du vol " + numeroVol + ":");
        for(Passager p : passagers) p.obtenirInfos();
    }
    
    // Getters indispensables
    public String getNumeroVol() { return numeroVol; }
    public void ajouterPassager(Passager p) { passagers.add(p); }
}