package cardsCollections;
import  java.util.List;
import java.util.ArrayList;

public class Deck {
    //3.4.1 ATRIBUTOS
    private List<Card> cards = new ArrayList<>();
    private byte numDecks;
    private byte numJokers;
    //3.4.2 CONSTRUCTORS
    public Deck(byte numDecks, byte numJokers) {
        this.numDecks = numDecks;
        this.numJokers = numJokers;
    }
    //3.4.3 MÈTODES
    //añade 52 cartas a la lista cards
    public void addDeckCards(){

    }
    //añade un Joker en la lista de cartaas
    public void addJocker(){

    }
    //Desordena la colección
    private void shuffleCards(){

    }
    //corta por una posición aleatoria entre la primera y la última posición
    private void cutCards(){

    }
    //Devuelve las primeras num cartas de la colección que posteriormente elimina d ela lista.Comrprueba si la lista tiene cartas antes de nada, y si no existen cartas suficientes retorna null ("NO ENOUGH CARDS")
    public List<Card> dealCards(byte num){
        return null;
    }
}
