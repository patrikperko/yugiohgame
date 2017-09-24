import java.util.Collections;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck {

    private static ArrayList<Card> deckStack = new ArrayList<Card>(40);;
    private static CardImage[] cardImages = new CardImage[40];
    private static Deck instance = new Deck();
    
    protected Deck() {
        instance = this; //pseudo singleton
	addSpellCard(new SpellCard("reigeki"));
        //addSpellCard(new SpellCard("reigeki"));
        setCardImageAt(0, "file:spellcard.jpg");
        //setCardImageAt(1, "file:spellcard.jpg");
    }

    public static void addSpellCard(SpellCard card) {
	deckStack.add(card);
    }

    public static void addTrapCard(TrapCard card) {
        deckStack.add(card);
    }

    public static void addMonsterCard(MonsterCard card) {
        deckStack.add(card);
    }

    public static ArrayList<Card> getDeckStack() {
        return deckStack;
    }

    public static Deck getInstance() {
        return instance;
    }

    public static Card draw() {
        return (Card) deckStack.remove(0);
    }

    public static CardImage getCardImageAt(int i) {
        return cardImages[i];
    }

    // public static void setCardImageAt(int i, String fileName) {
    //     cardImages[i] = new CardImage();
    //     cardImages[i].setFaceView(new ImageView(new Image(fileName)));
    //     cardImages[i].setSize();
    //     getCardAt(i).setCardImage(cardImages[i]);
    // }

    public static void setCardImageAt(int i, String fileName) {
	cardImages[i] = new CardImage();
	cardImages[i].setFaceView(new ImageView(new Image(fileName)));
	cardImages[i].setSize();
    }
}
