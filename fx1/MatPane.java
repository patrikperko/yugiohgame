import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;

public class MatPane extends StackPane {

    private Deck deck;
    private CardImage deckImage;
    private CardImage[] cardImages;
    private Image matImage;
    private ImageView deckView;
    private ImageView matView;

    private ImageView testView;

    public MatPane() {

        setUpDeck();
        matImage = new Image("file:background.jpg");
        matView = new ImageView(matImage);
        setMatSize();
        displayCards();
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
    }

    private void displayCards() {
        //try to show a card in the deck
        cardImages = new CardImage[10];
        cardImages[0] = new CardImage();
        cardImages[0].setFaceView(new ImageView(new Image("file:spellcard.jpg")));
        cardImages[0].setMonsterPos1();
        cardImages[0].setSize();
        cardImages[0].getFaceView().addEventHandler(MouseEvent.MOUSE_CLICKED,
            (MouseEvent e) -> {
                cardImages[0].setMonsterPos5();
            });

        deck.getCardAt(0).setCardImage(cardImages[0]);


        testView = deck.getCardAt(0).getCardImage().getFaceView();
    }

    public CardImage getImageAt(int i) {
        return cardImages[i];
    }
}