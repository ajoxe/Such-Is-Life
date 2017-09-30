package game;

import java.util.Scanner;

public class Game extends Deck {

    Player player = new Player();
    Scanner inp = new Scanner(System.in);


    public void startGame() {
        System.out.println("Life is like a game of cards. The hand you are dealt is determinism;\n" +
                " the way you play it is free will.\n");
        System.out.println("Such Is Life is a game that entertains the idea of life being determined by a hand of cards.\n" +
                "would you like to play a game of life?\n" +
                "Press 'y' or 'yes'\n");

        String start = inp.next();

        //while (inp.hasNextLine()) {
        if (start.equals("y") || start.equals("yes")) {
            System.out.println("Rad. Welcome to your new Life!\n");
        }
               /* else {
                    System.out.print("Don't be lame bro, just play the stupid game");
                }

            }*/
        System.out.println("What should I call you?");
        inp.nextLine();
        player.setName(inp.nextLine());
        System.out.println("Congratulations " + player.getName() + ", you are now born!\n");
    }

    public void level1() {
        System.out.println("Level 1: Childhood");
        System.out.println("Okay " + player.getName() + ", the hand you're dealt determines your: Parents, Environment, " +
                "Intelligence, and Experiences.\n" +
                "The value of each card will determine your opportunities. Stressed out yet?\n" +
                "Great, let's meet your parents!\n" +
                //start
                "Pick a number between 1 & 13; this number will represent how many times the deck is shuffled.");

        player.setShuffleCount(inp.nextInt());
        player.handDealt(2);

//parents
        System.out.println("You were dealt------------\n" +
                "Mom Card: " + player.handDealt.get(0).getCard());

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your mom is a " + player.getScore() + "/100.\n She's " + player.evaluation);

        System.out.println("Dad Card: " + player.handDealt.get(1).getCard());

        player.setScore(player.handDealt.get(1).getCardValue());
        player.evaluateScore();
        System.out.println("Your dad is a " + player.getScore() + "/100.\n He's " + player.evaluation);

        System.out.println("You gain " + player.getOpportunities() + " Opportunity points! \n" +
                //end
                //start
                "But what about your childhood environment? Let's Deal your hand\n" +
//environment
                "Pick a number between 1 & 13; this number will represent how many times the deck is shuffled.");

        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);


        System.out.println("You were dealt------------\n" +
                "Card Environment: " + player.handDealt.get(0).getCard());

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your environment is a " + player.getScore() + "/100.\n It's " + player.evaluation);


        System.out.println("You gain " + player.getOpportunities() + " Opportunity points! \n" +
                //end
                "But what about your intelligence?\n" +
                "Pick a number between 1 & 13; this number will represent how many times the deck is shuffled.");
//intelligence
        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);


        System.out.println("You were dealt------------\n" +
                "Intelligence Card: " + player.handDealt.get(0).getCard());

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your intelligence is a " + player.getScore() + "/100.\n Your mind is " + player.evaluation);
        System.out.println("You gain " + player.getOpportunities() + " Opportunity points! \n" +
                "But what about your childhood experiences?\n" +
                "Pick a number between 1 & 13; this number will represent how many times the deck is shuffled.");
//experiences
        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);


        System.out.println("You were dealt------------\n" +
                "Experiences Card: " + player.handDealt.get(0).getCard());

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your child hood experiences are " + player.getScore() + "/100.\n Your childhood was"
                + player.evaluation);
        System.out.println("You gain " + player.getOpportunities() + " Opportunity points! \n");

        //TODO: implement as such
        //levelCard("Intelligence", "mind");

    }


    private void levelCard(String cardType, String attribute) {
        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);
        System.out.println("You were dealt------------\n" +
                cardType + " Card: " + player.handDealt.get(0).getCard());

        player.setScore(player.handDealt.get(0).getCardValue());
        player.evaluateScore();
        System.out.println("Your " + cardType + " is a " + player.getScore() + "/100.\n Your" + attribute + " is " + player.evaluation);
        System.out.println("You gain " + player.getOpportunities() + " Opportunity points! \n" +
                "But what about your childhood experiences?\n" +
                "Pick a number between 1 & 13; this number will represent how many times the deck is shuffled.");
//experiences
        player.setShuffleCount(inp.nextInt());
        player.handDealt.clear();
        player.handDealt(1);

    }


}
