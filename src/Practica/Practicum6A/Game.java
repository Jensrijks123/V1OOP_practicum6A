package Practica.Practicum6A;

import java.time.LocalDate;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;
    private int huidigeJaar = LocalDate.now().getYear();
    private double jaarlijkseDaling = 0.7; // Percentage

    public Game(String nm, int rJ, double nwpr) {
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        double a = (huidigeJaar - releaseJaar); // Aantal jaren
        double d = nieuwprijs * Math.pow(jaarlijkseDaling, a);
        return d;
    }

    public boolean equals(Object andereObject) {

        return true;
    }

    public String toString() {
        return "Game{" + "naam='" + naam + '\'' + ", releaseJaar=" + releaseJaar + ", nieuwprijs=" + nieuwprijs + '}';
    }
}
