package src.main.java.fr.isep.airline.models;


public abstract class Employe extends Personne {
    protected String numeroEmploye; 
    protected String dateEmbauche;  

    public Employe(String id, String nom, String adr, String cnt, String numE, String dateE) {
        super(id, nom, adr, cnt);
        this.numeroEmploye = numE;
        this.dateEmbauche = dateE;
    }

    /** Retourne le rôle (Pilote ou Cabine) */
    public abstract String obtenirRole(); 
}