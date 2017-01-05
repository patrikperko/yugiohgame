import java.util.Collections;
import java.util.ArrayList;

public class Deck {

    protected static ArrayList<Card> backing;
    private static Deck instance = new Deck();

    public Deck() {
        instance = this; //pseudo singleton
        backing = new ArrayList<Card>(40);
        addSpellCard(new SpellCard("reigeki"));
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

}