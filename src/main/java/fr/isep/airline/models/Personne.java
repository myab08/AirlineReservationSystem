package src.main.java.fr.isep.airline.models;


// Personne.java
public abstract class Personne {
    protected String identifiant;
    protected String nom;        
    protected String adresse;    
    protected String contact;     

    public Personne(String id, String nom, String adresse, String contact) {
        this.identifiant = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    /** Affiche les informations d'une personne [cite: 92] */
    public void obtenirInfos() {
        System.out.println("ID: " + identifiant + ", Nom: " + nom + ", Contact: " + contact);
    }

    public String getIdentifiant() { return identifiant; } 


}

