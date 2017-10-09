import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Deck {

    // create a hashmap of cards and then array deck of cards
    private HashMap<String, Card> deck;
    private final int DECK_SIZE = 52;

    public Deck() {
        this.deck = new HashMap<>();
    }
    public void generateCard() {

        String cardTitle = Card.number + " of " + Card.suit;
    }

    public void shuffle() {
        Collections.shuffle(deck);
        deck.
    }

    public void distributeCards() {

    }
}
