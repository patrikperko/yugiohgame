package com.posobiec.controller;

import com.posobiec.model.*;
import com.posobiec.view.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/*
Application is the entry point for JavaFX applications
uses JavaFX runtime (Constructs instance of Application,
calls init() method, calls start(javafx.stage.Stage) method)
*/

public class UI extends Application {

    //the main method is not actually required
    public static void main(String[] args) {
        launch(args);
    }

    //launch calls the start method and makes the stage
    public void start(Stage stage1) {

        //CardImage cardImage = new CardImage();
        InfoPane menu = new InfoPane("Yugioh", "Life Points:", "Shift");
        menu.getChildren().addAll(menu.getTitle(),
                                  menu.getLifePoints(),
                                  menu.getShift());

        // cardImage.setSize();
        // cardImage.setPos();

        MatPane matPane = new MatPane();
        matPane.getChildren().addAll(matPane.getMatView() ,
                                     matPane.getDeckView());

        HandPane handPane = new HandPane();
        handPane.getChildren().addAll(handPane.getHandBackgroundView(),
                                      handPane.getHandLayout());

        BorderPane gamePane = new BorderPane();
        gamePane.setLeft(menu);
        gamePane.setCenter(matPane);
        gamePane.setBottom(handPane);

        Scene scene1 = new Scene(gamePane);
        stage1.setScene(scene1);
        stage1.show();
    }
}
