import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HandPane extends StackPane {
    private Image handBackgroundImage;
    private ImageView handBackgroundView;
    private CardImage[] handImages;
    private HBox handLayout;

    public HandPane() {
        handBackgroundImage = new Image("file:handbackground.jpg");
        handBackgroundView = new ImageView(handBackgroundImage);
        setHandBackgroundSize();
        handImages = new CardImage[10];
        handLayout = new HBox();
        draw();
    }

    public Image getHandBackgroundImage() {
        return handBackgroundImage;
    }

    public ImageView getHandBackgroundView() {
        return handBackgroundView;
    }

    public void setHandBackgroundSize() {
        handBackgroundView.setFitWidth(1080);
        handBackgroundView.setFitHeight(100);
    }

    public HBox getHandLayout() {
        return handLayout;
    }

    public void draw() {
        handLayout.getChildren().addAll
        (Deck.getCardAt(0).getCardImage().getFaceView());
        Deck.getCardAt(0).getCardImage().getFaceView().setTranslateY(0);
    }
}