package com.posobiec.controller; 

import com.posobiec.model.*;
import com.posobiec.view.*;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class HandPane extends StackPane {
    private Image handBackgroundImage;
    private ImageView handBackgroundView;
    private HBox handLayout;

    
    public HandPane() {
        super();


	ClassLoader classLoader = getClass().getClassLoader();
	handBackgroundImage = new Image(classLoader.getResource("panes/handbackground.jpg").toString());
	handBackgroundView = new ImageView(handBackgroundImage);
	
        //handBackgroundImage = new Image("file:handbackground.jpg");
        //handBackgroundView = new ImageView(handBackgroundImage);
        setHandBackgroundSize();
        handLayout = new HBox();
        draw();
        clickable(0);
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
        handLayout.getChildren().addAll(Deck.getCardImageAt(0).getFaceView());
        Deck.getCardImageAt(0).getFaceView().setTranslateY(0);
    }

    public void clickable(int i) {
        Deck.getCardImageAt(i).getFaceView().addEventHandler(MouseEvent.MOUSE_CLICKED,
							     (MouseEvent e) -> {
								 Deck.getCardImageAt(i).getFaceView().setTranslateX(100);
	});
    }
}
