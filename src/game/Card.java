package game;

public class Card {

        private String suit;
        private String rank;
        private String cardIs;
        private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        private String[] suits = {"Hearts", "Diamonds",  "Clubs","Spades" };
        private String card;
        private int cardIndex;
        private int cardValue;


        public Card (){
       /* this.rank = getRank();
        this.suit = getSuit();
        this.cardIndex = getCardIndex();
        this.card = getCard();
        this.cardValue = getCardValue();*/


        }

        public int getCardValue() {
            return cardValue;
        }

        public void setCardValue(int cardValue) {
            this.cardValue = cardValue;
        }
/* public String cardIs(){

        for(String st : suits){

            for (int i = 0; i <ranks.length; i++) {
                this.rank = ranks[i];
                this.suit = st;
                this.cardIs = (this.rank + " of " + this.suit);
                int cardIndex = i+1;
                System.out.println(cardIndex + ": " +  this.cardIs);
            }


        }


        return this.cardIs;

    }*/

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getCardIs() {
            return cardIs;
        }

        public void setCardIs(String cardIs) {
            this.cardIs = cardIs;
        }

        public String[] getRanks() {
            return ranks;
        }

        public void setRanks(String[] ranks) {
            this.ranks = ranks;
        }

        public String[] getSuits() {
            return suits;
        }

        public void setSuits(String[] suits) {
            this.suits = suits;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public int getCardIndex() {
            return cardIndex;
        }

        public void setCardIndex(int cardIndex) {
            this.cardIndex = cardIndex;
        }


}
