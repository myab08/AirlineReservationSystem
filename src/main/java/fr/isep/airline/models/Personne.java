package src.main.java.fr.isep.airline.models;


// Personne.java
public abstract class Personne {
    protected String identifiant; // [cite: 31]
    protected String nom;         // [cite: 32]
    protected String adresse;     // [cite: 33]
    protected String contact;     // [cite: 34]

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

// Employe.java


// Pilote.java
