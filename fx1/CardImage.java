import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardImage {

    private Image face;
    private Image back;
    private ImageView faceView;
    private ImageView backView;

    public CardImage() {
        face = new Image("file:default.jpg");
        back = new Image("file:cardback.png");
        faceView = new ImageView();
        backView = new ImageView();

        faceView.setImage(face);
        backView.setImage(back);

    }

    public Image getFace() {
        return face;
    }

    public Image getBack() {
        return back;
    }

    public ImageView getFaceView() {
        return faceView;
    }

    public ImageView getBackView() {
        return backView;
    }

    public void setSize() {
        faceView.setFitWidth(90);
        faceView.setFitHeight(120);
        backView.setFitWidth(90);
        backView.setFitHeight(120);
    }

    public void setPos() {
        faceView.setTranslateX(Zone.GRAVEYARDZONE.getX());
        faceView.setTranslateY(Zone.GRAVEYARDZONE.getY());
        backView.setTranslateX(Zone.GRAVEYARDZONE.getX());
        backView.setTranslateY(Zone.GRAVEYARDZONE.getY());

    }

    public void setDeckPos() {
        faceView.setTranslateX(Zone.DECKZONE.getX());
        faceView.setTranslateY(Zone.DECKZONE.getY());
        backView.setTranslateX(Zone.DECKZONE.getX());
        backView.setTranslateY(Zone.DECKZONE.getY());
    }

    public void setSpellTrapPos() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE1.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE1.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE1.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE1.getY());
    }

    public void setFace(Image face) {
        this.face = face;
    }

    public void setBack(Image back) {
        this.back = back;
    }

    public void setFaceView(ImageView faceView) {
        this.faceView = faceView;
    }

    public void setBackView(ImageView backView) {
        this.backView = backView;
    }
}