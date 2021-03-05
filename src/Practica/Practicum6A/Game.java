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
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar ) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        String s = naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + "€" + String.format("%.2f", nieuwprijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
        return s;
    }
}
