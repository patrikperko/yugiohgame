import java.util.Collections;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck {

    // private static ArrayList<Card> backing = new ArrayList<Card>(40);;
    private static CardImage[] cardImages = new CardImage[40];
    private static Deck instance = new Deck();
    private static CardStack<Card> deckStack = new CardStack<Card>();

    protected Deck() {
        instance = this; //pseudo singleton
        addSpellCard(new SpellCard("reigeki"));
        addSpellCard(new SpellCard("reigeki"));
        setCardImageAt(0, "file:spellcard.jpg");
        setCardImageAt(1, "file:spellcard.jpg");
    }

    public static void addSpellCard(SpellCard card) {
        deckStack.enqueue(card);
    }

    public static void addTrapCard(TrapCard card) {
        deckStack.enqueue(card);
    }

    public static void addMonsterCard(MonsterCard card) {
        deckStack.enqueue(card);
    }

    public static CardStack<Card> getDeckStack() {
        return deckStack;
    }

    public static Deck getInstance() {
        return instance;
    }

    public static Card draw() {
        return (Card) deckStack.dequeue();
    }

    // public static CardImage getCardImage(int i) {
    //     return getCardAt(i).getCardImage();
    // }

    // public static void setCardImageAt(int i, String fileName) {
    //     cardImages[i] = new CardImage();
    //     cardImages[i].setFaceView(new ImageView(new Image(fileName)));
    //     cardImages[i].setSize();
    //     getCardAt(i).setCardImage(cardImages[i]);
    // }

}