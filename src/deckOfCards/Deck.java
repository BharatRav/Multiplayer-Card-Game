package deckOfCards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<Card>(52);

        for (int i=0;i<4;i++) {                 //type of card ("Clubs", "Spades", "Diamonds", "Hearts")
            for (int j=0;j<13;j++) {
                cards.add(new Card(i,j));       //13 cards of same suit
            }
        }
    }

    public  Card drawRandomCard() {
        Random random = new Random();
        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }

    public String remainingCardsInDeck() {
        String result ="Cards remaining in deck: "+cards.size();
        return result;
    }

}
