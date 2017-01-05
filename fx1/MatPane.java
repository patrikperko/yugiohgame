import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;

public class MatPane extends StackPane {

    private CardImage deckImage;
    private CardImage[] cardImages;
    private Image matImage;
    private ImageView deckView;
    private ImageView matView;

    public MatPane() {
        displayDeck();
        matImage = new Image("file:background.jpg");
        matView = new ImageView(matImage);
        setMatSize();
        displayCards();
    }

    public void setMatSize() {
        matView.setFitWidth(1080);
        matView.setFitHeight(720);
    }

    public ImageView getDeckView() {
        return deckView;
    }

    public ImageView getMatView() {
        return matView;
    }

    private void displayDeck() {
        deckImage = new CardImage();
        deckImage.setDeckPos();
        deckImage.setSize();
        deckView = deckImage.getBackView();
    }

    //needs revision
    private void displayCards() {
        //try to show a card in the deck
        cardImages = new CardImage[10];
        cardImages[0] = new CardImage();
        cardImages[0].setFaceView(new ImageView(new Image("file:spellcard.jpg")));
        cardImages[0].setMonsterPos1();
        cardImages[0].setSize();
        // cardImages[0].getFaceView().addEventHandler(MouseEvent.MOUSE_CLICKED,
        //     (MouseEvent e) -> {
        //         cardImages[0].setMonsterPos5();
        //     });

        setCardImageAt(0);
    }

    public CardImage getImageAt(int i) {
        return Deck.getCardAt(i).getCardImage();
    }

    public void setCardImageAt(int i) {
        Deck.getCardAt(i).setCardImage(cardImages[i]);
    }
}