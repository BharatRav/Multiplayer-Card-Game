package deckOfCards;

public class Card {
    private int type,value;
    boolean isActionCard;
    private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue ={"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int types, int values) {
        type =types;
        value =values;


        if(values<4) {
            isActionCard =true;
        }
        else {
            isActionCard =false;
        }
    }
    public String cardDetails() {
        String finalCard = cardValue[value]+" of "+cardType[type];
        if (isActionCard) {
            finalCard = finalCard+" [Action Card]";
        } else {
            finalCard+=" [Action Card]";
        }
        return  finalCard;
    }
}
