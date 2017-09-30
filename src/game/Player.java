package game;

import java.util.ArrayList;

public class Player extends Deck {
    static String name;
    static int score;
    static ArrayList<Card> handDealt = new ArrayList<>();
    static int parents = 2;
    int shuffleCount;
    static ArrayList<Card> check = new ArrayList<>();
    String evaluation = "";
    static int opportunities = 0;

    public ArrayList<Card> handDealt(int a) {
        buildDeck();

        for (int i = 0; i < getShuffleCount(); i++){
            shuffledDeck();
        }
        for (int j = 0; j < a; j++){
            handDealt.add(shuffledDeck.get(a));
            shuffledDeck.remove(a);
        }
        shuffledDeck.addAll(handDealt);

        return handDealt;
    }

    public int evaluateScore(){
        switch (score){
            case 1: case 2: case 3:
                score = 25;
                evaluation ="The Worst";
                opportunities += 1;
                break;
            case 4: case 5: case 6:
                score = 50;
                evaluation ="Not great. Not the Worst, but definitely Not Great";
                opportunities += 3;
                break;
            case 7: case 8: case 9:
                score = 75;
                evaluation ="Okay, I guess...";
                opportunities += 5;
                break;
            case 10: case 11: case 13:
                score = 100;
                evaluation ="The Best!!!";
                opportunities += 10;
                break;


        }
       return score;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public int getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(int opportunities) {
        this.opportunities = opportunities;
    }

    public static int getParents() {
        return parents;
    }

    public static void setParents(int parents) {
        Player.parents = parents;
    }

    public int getShuffleCount() {
        return shuffleCount;
    }

    public void setShuffleCount(int shuffleCount) {
        this.shuffleCount = shuffleCount;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Player.score = score;
    }

    public static ArrayList<Card> getHandDealt() {
        return handDealt;
    }

    public static void setHandDealt(ArrayList<Card> handDealt) {
        Player.handDealt = handDealt;
    }


}
