package game;

import java.util.ArrayList;

public class Deck {



        private int cardCount = 52;
        private int rankCount = 13;
        private int suitCount = 4;
        static ArrayList<Card> deck = new ArrayList<>();
        static ArrayList<Card> shuffledDeck = new ArrayList<>();


        static Card buildDeck = new Card();



        public static ArrayList<Card> buildDeck() {
            int a = 0;
            for (String st : buildDeck.getSuits()) {
                for (int i = 0; i < buildDeck.getRanks().length; i++) {
                    Card card = new Card();
                    card.setRank(card.getRanks()[i]);
                    card.setSuit(st);
                    card.setCard(card.getRank() + " of " + card.getSuit());
                    card.setCardIndex(a + 1);
                    card.setCardValue(i + 1);
                    deck.add(card);
                    a++;
                }
            }
            shuffledDeck.addAll(deck);
            return deck;
        }

        public static ArrayList<Card> shuffledDeck() {

            ArrayList<Card> splitDeckTop = new ArrayList<>();
            for (int i = 0; i < deck.size()/2; i++) {
                splitDeckTop.add(i, shuffledDeck.get(i));
            }
            ArrayList<Card> splitDeckBottom = new ArrayList<>();
            int k = 26;
            for (int j = 0; j < deck.size()/2; j++) {
                splitDeckBottom.add(j, shuffledDeck.get(k));
                k++;
            }
            shuffledDeck.clear();

            for (int l=0; l<deck.size()/2; l++){
                shuffledDeck.add(splitDeckBottom.get(l));
                shuffledDeck.add(splitDeckTop.get(l));
            }
            /*for (int m =0; m<shuffledDeck.size(); m++){
                System.out.println(shuffledDeck.get(m).getCard() + shuffledDeck.size());
            }*/
            return shuffledDeck;
        }
    }




