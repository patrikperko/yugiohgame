package com.posobiec.controller;

import com.posobiec.model.*;
import com.posobiec.view.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class InfoPane extends VBox {

    private Label title;
    private Label lifePoints;
    private Button shift;

    public InfoPane(String title, String lifePoints, String shift) {
        super();
        this.title = new Label(title);
        this.lifePoints = new Label(lifePoints);
        this.shift = new Button(shift);
        doStuff();
    }

    public Label getTitle() {
        return this.title;
    }

    public Label getLifePoints() {
        return this.lifePoints;
    }

    public Button getShift() {
        return this.shift;
    }

    public void doStuff() {
        this.shift.setOnAction((ActionEvent e) -> {
            this.title.setText("Button Pressed");
        });
    }
}
