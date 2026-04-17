package src.main.java.fr.isep.airline.models;


public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut; // "Confirmée", "Annulée"
    private Passager passager;
    private Vol vol;

    public Reservation(String numeroReservation, String dateReservation, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;

        this.passager = passager;
        this.vol = vol;
        this.statut = "En attente";
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée"; 
    }
    public String getNumeroReservation() { return numeroReservation; }  

    public Passager getPassager() { return passager; }
    public Vol getVol() { return vol; } 
}