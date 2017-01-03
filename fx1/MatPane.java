import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class MatPane extends StackPane {

    private Deck deck;
    private CardImage deckImage;
    private CardImage testImage;
    private Image matImage;
    private ImageView deckView;
    private ImageView matView;

    private ImageView testView;

    public MatPane() {

        setUpDeck();
        matImage = new Image("file:background.jpg");
        matView = new ImageView(matImage);
        setMatSize();
    }

    public void setMatSize() {
        matView.setFitWidth(1080);
        matView.setFitHeight(720);
    }

    public Deck getDeck() {
        return deck;
    }

    public ImageView getDeckView() {
        return deckView;
    }

    public ImageView getMatView() {
        return matView;
    }

    private void setUpDeck() {
        deck = new KaibaDeck();
        deckImage = new CardImage();
        deckImage.setDeckPos();
        deckImage.setSize();
        deckView = deckImage.getBackView();


        //try to show a card in the deck
        testImage = new CardImage();
        testImage.setFaceView(new ImageView(new Image("file:spellcard.jpg")));
        testImage.setSpellTrapPos();
        testImage.setSize();

        deck.getCardAt(0).setCardImage(testImage);
        testView = deck.getCardAt(0).getCardImage().getFaceView();

    }


    public CardImage getTestImage() {
        return testImage;
    }

}