package src.main.java.fr.isep.airline.models;


public class Pilote extends Employe {
    private String licence;    
    private int heuresDeVol;   

    public Pilote(String id, String nom, String adr, String cnt, String numE, String dateE, String licence) {
        super(id, nom, adr, cnt, numE, dateE);
        this.licence = licence;
    }

    public String obtenirRole() { return "Pilote"; }
    
    public void affecterVol() { System.out.println("Pilote affecté au vol."); } // [cite: 73]
}