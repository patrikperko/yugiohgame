package com.posobiec.controller;

import com.posobiec.model.*;
import com.posobiec.view.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;

public class MatPane extends StackPane {

    private CardImage deckImage;
    private Image matImage;
    private ImageView deckView;
    private ImageView matView;

    public MatPane() {
        displayDeck();
        matImage = new Image("file:background.jpg");
        matView = new ImageView(matImage);
        setMatSize();
        //displayCards();
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

    //public CardImage getImageAt(int i) {
	// return Deck.getCardAt(i).getCardImage();
	//}
}
