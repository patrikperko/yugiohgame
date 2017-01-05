import java.util.Collections;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck {

    protected static ArrayList<Card> backing;
    private static Deck instance = new Deck();
    private static CardImage[] cardImages = new CardImage[40];

    public Deck() {
        instance = this; //pseudo singleton
        backing = new ArrayList<Card>(40);
        addSpellCard(new SpellCard("reigeki"));
        addSpellCard(new SpellCard("reigeki"));
        setCardImages();
    }

    public static void addSpellCard(SpellCard card) {
        backing.add(card);
    }

    public static void addTrapCard(TrapCard card) {
        backing.add(card);
    }

    public static void addMonsterCard(MonsterCard card) {
        backing.add(card);
    }

    public static ArrayList<Card> getBacking() {
        return backing;
    }

    public static Card getCardAt(int i) {
        return backing.get(i);
    }

    public static Deck getInstance() {
        return instance;
    }

    public static void setCardImages() {
        cardImages = new CardImage[10];
        cardImages[0] = new CardImage();
        cardImages[0].setFaceView(new ImageView(new Image("file:spellcard.jpg")));
        cardImages[0].setMonsterPos1();
        cardImages[0].setSize();
        setCardImageAt(0);

        cardImages[1] = new CardImage();
        cardImages[1].setFaceView(new ImageView(new Image("file:spellcard.jpg")));
        cardImages[1].setMonsterPos2();
        cardImages[1].setSize();
        setCardImageAt(1);
    }

    public static CardImage getCardImageAt(int i) {
        return getCardAt(i).getCardImage();
    }

    public static void setCardImageAt(int i) {
        getCardAt(i).setCardImage(cardImages[i]);
    }

}