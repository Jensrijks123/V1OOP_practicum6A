package Practica.Practicum6A;

import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private Game mijnGames;
    private ArrayList<Game> games;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget - mijnGames.huidigeWaarde() >= 0) {
            if (naam ) {

            }
        }

        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {

        return false;
    }

    public String toString() {
        String s = naam + " heeft een budget van " + budget + " en bezit de volgende games: \n" + mijnGames;
        return s;
    }
}
