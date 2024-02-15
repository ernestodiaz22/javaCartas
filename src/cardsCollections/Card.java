package cardsCollections;
public class Card implements  Comparable<Card> {//aquí indicamos que hemos implementado una interfaz Comparable, dando a entender que las instancias de clasCard pueden ser comparables
    private Suit suit;
    private CardRank cardRank;
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";
    //CONSTRUCTORES
    public Card(Suit suit, CardRank cardRank) {
        this.suit = suit;
        this.cardRank = cardRank;
    }
    //GETTERS Y SETTERS
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
    //3.3.4 convertSuit
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
    //3.3.5 TO STRING PERSONALIZADO QUE MUESTRA COLOR,RANGO Y CUELLO DE LA CARTA
    @Override
    public String toString() {
        if(suit == Suit.HEARTS || suit == Suit.DIAMONDS){
            return ANSI_RED +  convertSuit(suit) + "" + cardRank.getCardValue() + ANSI_RESET;
        }
        return ANSI_BLACK +  convertSuit(suit) + "" + cardRank.getCardValue() + ANSI_RESET;
    }
    //3.3.6 INTERFAZ COMPARABLE CON COMPARETO PERSONALIZADO
    //Utilizamos la implementación de una interfaz Comparable para la ordenación de objetos en una colección(listas,arboles, etc...)
    //definimos la interfaz en la clase ClassCard
    public interface CardComparable {//definimos una interfaz llamada CardComparable
        int comparaSuitRank(Card card);//objeto de clase ClassCard pasado como parametro a la función que nos da un entero que indica la relación de orden entre las dos cartas
    }
    //implementamos la interfaz en la clase classCard
    private CardComparable comparaCartas = new CardComparable() {
        //creamos nuestra comparación personalizada
        @Override
        public int comparaSuitRank(Card card) {
            //comparamos primero el cuello de la carta
            int compararSuit = suit.compareTo(card.getSuit());
            //devuelve un valor negativo si el cuello de la carta actual es menor(valor cardinal menor, ejemplo: JOKER = 0 < CLUBS = 1 );
            // devuelve 0 si los valores del cuello son iguales respecto al de la carta actual (valor cardinal igual, ejemplo: CLUBS = 1 == CLUBS = 1);
            // devuelve un valor positivo si el cuello de la carta actual es mayor(valor cardinal mayor, ejemplo: DIAMONDS = 2 > CLUBS = 0 );
            if(compararSuit != 0){
                return compararSuit;//si el cuello de la carta es menor, devulve el valor, ya que, al conocer que el palo es menor, no necesitamos comparar el rango.
            }
            return cardRank.compareTo(card.getCardRank());
            //devuelve un valor negativo si el rango de la carta actual es menor(valor cardinal menor, ejemplo: JOKER = 0 < TWO = 1 );
            // devuelve 0 si los valores son iguales respecto al de la carta actual (valor cardinal igual, ejemplo: JOKER = 0 == JOKER = 0 );
            // devuelve un valor positivo si el rango de la carta actual es mayor(valor cardinal mayor, ejemplo: two = 1 > JOKER = 0 );
        }
    };
    //obtenemos una instancia del comparador
    public CardComparable getComparator(){
        return comparaCartas;//getter para que otros objetos puedan obtener un comparador de cartas
    }
    @Override
    public int compareTo(Card card){
        //implementación predeterminada de compareTo para ClassCard
        return 0;//devuelve siempre cero, lo cual indica que las instancias de classCard son iguales entre sí para después ejercer una comparación más específica de cuello y rango en la implementación de la interfaz
    }
}


