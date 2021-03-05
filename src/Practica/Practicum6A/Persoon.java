package Practica.Practicum6A;

import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        mijnGames = new ArrayList<Game>();

    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        boolean check = false;
        boolean koop = false;

        for (Game game : mijnGames) {
            if (game.getNaam().equals(g.getNaam())) {
                check = true;
                koop = false;
            }
        }

        if (!check) {
            if (budget - g.huidigeWaarde() >= 0){
                mijnGames.add(g);
                budget = budget - g.huidigeWaarde();
                koop = true;
            }
        }

        return koop;
    }

    public boolean verkoop(Game g, Persoon koper) {
        boolean checkVerkoper = false;
        boolean checkKoper = false;
        boolean verkoop = false;

        // Verkoper heeft spel check
        for (Game game : mijnGames) {
            if (game.getNaam().equals(g.getNaam())) {
                checkVerkoper = true;
            }
        }

        if (checkVerkoper) {
            // koper heeft spel check
            for (Game gameK : koper.mijnGames) {
                if (gameK.getNaam().equals(g.getNaam())) {
                    checkKoper = true;
                    verkoop = false;
                }
            }

            if (!checkKoper) {
                if (koper.budget - g.huidigeWaarde() >= 0) {
                    koper.mijnGames.add(g);
                    mijnGames.remove(g);
                    budget = budget + g.huidigeWaarde();
                    koper.budget = koper.budget - g.huidigeWaarde();
                    verkoop = true;
                }
            }
        }
        return verkoop;
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        for (Game game : teKoop) {
            if (game.getNaam().equals(game.getNaam())) {
                teKoop.remove(game);
            }
        }
        return teKoop;
    }

    public String toString() {
        String s = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        for (Game game : mijnGames) {
            s = s + "\n" +game.toString();
        }

        return s;
    }
}
