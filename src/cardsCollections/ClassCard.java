package cardsCollections;
public class ClassCard {
    private Suit suit;
    private CardRank cardRank;
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";

    public ClassCard(Suit suit, CardRank cardRank) {
        this.suit = suit;
        this.cardRank = cardRank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

  private String convertSuit(Suit suit) {
        switch (suit) {
            case JOKER:
                return "JOKER";
            case CLUBS:
                return "\u2663";
            case DIAMONDS:
                return "\u2666";
            case HEARTS:
                return "\u2665";
            case SPADES:
                return "\u2660";
            default:
                return "Desconocido";
        }
    }

    @Override
    public String toString() {
        if(suit == Suit.HEARTS || suit == Suit.DIAMONDS){
            return ANSI_RED +  convertSuit(suit) + "" + cardRank.getCardValue() + ANSI_RESET;
        }
        return ANSI_BLACK +  convertSuit(suit) + "" + cardRank.getCardValue() + ANSI_RESET;
    }
}
