import java.util.Collections;
import java.util.ArrayList;

public class Deck {

    protected ArrayList<Card> backing;

    public Deck() {
        backing = new ArrayList<Card>();
    }

    public void addSpellCard(SpellCard card) {
        backing.add(card);
    }

    public void addTrapCard(TrapCard card) {
        backing.add(card);
    }

    public void addMonsterCard(MonsterCard card) {
        backing.add(card);
    }

    public ArrayList<Card> getBacking() {
        return backing;
    }

    public Card getCardAt(int i) {
        return backing.get(i);
    }

}