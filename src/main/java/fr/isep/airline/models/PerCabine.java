package src.main.java.fr.isep.airline.models;

public class PerCabine extends Employe {
    private String qualification;

    public PerCabine(String id, String nom, String adr, String cnt, String numE, String dateE, String qualif) {
        super(id, nom, adr, cnt, numE, dateE);
        this.qualification = qualif;
    }

    public String obtenirRole() { return "Personnel de Cabine"; }
    public void affecterVol() { System.out.println("Membre de cabine affecté."); }
    public void obtenirVol() { /* Logique */ }
}