package game;

import java.util.Scanner;

public class Game extends Deck {
    String[] cardTypeL1 = {"Mom", "Dad", "Intelligence","Environmen","Experiences", };
    Player player = new Player();
    Scanner inp = new Scanner(System.in);


    public void startGame() {
        System.out.println("***********************************************   ''  ****************************************************\n\n" +
                "Life is like a game of cards. The hand you are dealt is determinism; the way you play it is free will.\n\n" +
                "***********************************************   ''  ****************************************************\n");
        System.out.println("Such Is Life is a game that entertains the idea of life being determined by a hand of cards.\n\n" +
                "Would you like to play a game of life? Press 'y' or 'yes'");

        String start = inp.next();

        //while (inp.hasNextLine()) {
        if (start.equals("y") || start.equals("yes")) {
            System.out.println("*** Rad. Welcome to your new Life! ***\n");
        }

        System.out.println("What should I call you?");
        inp.nextLine();
        player.setName(inp.nextLine());
        System.out.println("Congratulations " + player.getName() + ", you are now born!\n");
    }

    public void level1() {
        System.out.println("Level 1\n"+
            "***************************  Your Childhood  ***************************\n\n"+
           "Okay " + player.getName() + ", the hand you're dealt determines your: Parents, Environment, " +
                "Intelligence, and Experiences.\n" +
                "The value of each card will determine your opportunities in life. Stressed out yet?\n\n" +
                "******************************************************\n");
        levelCard("Mom", "mother");
        levelCard("Dad", "father");
        levelCard("Intelligence", "mind");
        levelCard("Experiences", "childhood memories");
        levelCard("Environment", "neighborhood");



        //TODO: implement next steps as such
           // wrap up method, (evaluate), acts of God


        System.out.println("**** Awesome, your childhood is now set for life! *****\n" +
                "You have no choices at this level.\n" +
                "Time to move on to the next level, Puberty!!!");


    }

    public void level2() {
        System.out.println("\n\nLevel 2\n"+
                "***************************  Puberty!!  ***************************\n\n"+
                "Okay " + player.getName() + ", this level includes Choices!" +
                "Your choices are determined by your Opportunity points and also effects them\n" +
                "The hand you're dealt determines your: School, Physical Appearance, Talent,  and Physical Abilities " +
                "******************************************************\n");
        levelCard2("School", "education");
        levelCard2("Physical Appearance", "attractiveness");
        levelCard2("Talent", "talent level");
        levelCard2("Physical Abilities", "dexterity");








        System.out.println("**** Awesome, Puberty almost over! *****\n" +
                "You 2 choices at this level.\n");
        //TODO: implement next steps as such
        // choices


    }


    private void levelCard(String cardType, String attribute) {
        String draw = "Let's draw a card to see what you get.\nHow many times should the deck be shuffled?";
        switch (cardType){
            case "Mom":
                System.out.println("Great, let's meet your parents! Draw a card to find out what your " + cardType +
                        " is like.\nHow many times should the deck be shuffled?");
                break;
            case "Dad":
                System.out.println("Time to meet your " + cardType + ". " +
                draw);
                break;
            case "Intelligence":
                System.out.println("So you have your parents, now its time to find out what your " + cardType + "level is. " +
                draw);
                break;
            case "Environment":
                System.out.println("What about your childhood " + cardType + "? " +
                draw);
                break;
            case "Experiences":
                System.out.println("Childhood memories can have life long effects, time to find out about your" + cardType + ". "
                +draw);
                break;
        }


        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);
        System.out.println("----------------"+ cardType+" Card----------------\n" +
                 "You were dealt: **** " + player.handDealt.get(0).getCard() + " ****");

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your " + cardType + " ranks " + player.getScore() + "/100.\n\nYour " + attribute + " is "
                + player.evaluation +"\n\n");
        System.out.println(" *** You get *** " + player.getOpportunity() + " *** Opportunity Points! *** \n" +
                "Total Opportunities: " + player.getOpportunities() +"\n" +
                "---------------------------------------------\n");
    }

    private void levelCard2(String cardType, String attribute) {
        String draw = "Let's draw a card to see what you get.\nHow many times should the deck be shuffled?";
        switch (cardType){
            case "School":
                System.out.println("Time to find out about" + cardType +
                        draw);
                break;

            case "Physical Appearance":
                System.out.println("Your " + cardType + "effects whether you're bullies and your social groups" +
                        draw);
                break;

            case "Talent":
                System.out.println("What about your " + cardType + "s? You could be a young, pimply Picasso!" +
                        draw);
                break;


            case "Physical Abilities":
                System.out.println("Your " + cardType +"can also effect your popularity"
                        +draw);
                break;
        }


        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);
        System.out.println("----------------"+ cardType+" Card----------------\n" +
                "You were dealt: **** " + player.handDealt.get(0).getCard() + " ****");

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your " + cardType + " ranks " + player.getScore() + "/100.\n\nYour " + attribute + " is "
                + player.evaluation +"\n\n");
        System.out.println(" *** You get *** " + player.getOpportunity() + " *** Opportunity Points! *** \n" +
                "Total Opportunities: " + player.getOpportunities() +"\n" +
                "---------------------------------------------\n");
    }


}
