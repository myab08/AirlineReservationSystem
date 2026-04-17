package src.main.java.fr.isep.airline.models;


public abstract class Employe extends Personne {
    protected String numeroEmploye; // [cite: 49]
    protected String dateEmbauche;  // [cite: 55]

    public Employe(String id, String nom, String adr, String cnt, String numE, String dateE) {
        super(id, nom, adr, cnt);
        this.numeroEmploye = numE;
        this.dateEmbauche = dateE;
    }

    /** Retourne le rôle (Pilote ou Cabine) [cite: 93] */
    public abstract String obtenirRole(); 
}