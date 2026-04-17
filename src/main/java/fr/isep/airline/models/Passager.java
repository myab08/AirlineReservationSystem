package src.main.java.fr.isep.airline.models;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(String id, String nom, String adr, String cnt, String passeport) {
        super(id, nom, adr, cnt);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    /** Un passager peut déclencher une réservation  */
    public void reserverVol(Reservation r) { reservations.add(r); }
    public void annulerReservation(String id) { reservations.removeIf(r -> r.getNumeroReservation().equals(id)); }
    public List<Reservation> obtenirReservations() { return reservations; }
}