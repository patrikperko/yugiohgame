package com.posobiec.view;

import com.posobiec.controller.*;
import com.posobiec.model.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardImage {

    private Image face;
    private Image back;
    private ImageView faceView;
    private ImageView backView;

    public CardImage() {
        face = new Image("file:../../../../../resources/main/spellcard.jpg");
        back = new Image("file:cardback.png");
        faceView = new ImageView();
        backView = new ImageView();
        faceView.setImage(face);
        backView.setImage(back);
	setSize();

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

    public void setGraveyardPos() {
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

    public void setSpellTrapPos1() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE1.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE1.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE1.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE1.getY());
    }

    public void setSpellTrapPos2() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE2.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE2.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE2.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE2.getY());
    }

    public void setSpellTrapPos3() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE3.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE3.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE3.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE3.getY());
    }

    public void setSpellTrapPos4() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE4.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE4.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE4.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE4.getY());
    }

    public void setSpellTrapPos5() {
        faceView.setTranslateX(Zone.SPELLTRAPZONE5.getX());
        faceView.setTranslateY(Zone.SPELLTRAPZONE5.getY());
        backView.setTranslateX(Zone.SPELLTRAPZONE5.getX());
        backView.setTranslateY(Zone.SPELLTRAPZONE5.getY());
    }

    public void setMonsterPos1() {
        faceView.setTranslateX(Zone.MONSTERZONE1.getX());
        faceView.setTranslateY(Zone.MONSTERZONE1.getY());
        backView.setTranslateX(Zone.MONSTERZONE1.getX());
        backView.setTranslateY(Zone.MONSTERZONE1.getY());
    }

    public void setMonsterPos2() {
        faceView.setTranslateX(Zone.MONSTERZONE2.getX());
        faceView.setTranslateY(Zone.MONSTERZONE2.getY());
        backView.setTranslateX(Zone.MONSTERZONE2.getX());
        backView.setTranslateY(Zone.MONSTERZONE2.getY());
    }

    public void setMonsterPos3() {
        faceView.setTranslateX(Zone.MONSTERZONE3.getX());
        faceView.setTranslateY(Zone.MONSTERZONE3.getY());
        backView.setTranslateX(Zone.MONSTERZONE3.getX());
        backView.setTranslateY(Zone.MONSTERZONE3.getY());
    }

    public void setMonsterPos4() {
        faceView.setTranslateX(Zone.MONSTERZONE4.getX());
        faceView.setTranslateY(Zone.MONSTERZONE4.getY());
        backView.setTranslateX(Zone.MONSTERZONE4.getX());
        backView.setTranslateY(Zone.MONSTERZONE4.getY());
    }

    public void setMonsterPos5() {
        faceView.setTranslateX(Zone.MONSTERZONE5.getX());
        faceView.setTranslateY(Zone.MONSTERZONE5.getY());
        backView.setTranslateX(Zone.MONSTERZONE5.getX());
        backView.setTranslateY(Zone.MONSTERZONE5.getY());
    }

    public void setExtraDeckPos() {
        faceView.setTranslateX(Zone.EXTRADECKZONE.getX());
        faceView.setTranslateY(Zone.EXTRADECKZONE.getY());
        backView.setTranslateX(Zone.EXTRADECKZONE.getX());
        backView.setTranslateY(Zone.EXTRADECKZONE.getY());
    }

    public void setFieldSpellPos() {
        faceView.setTranslateX(Zone.FIELDSPELLZONE.getX());
        faceView.setTranslateY(Zone.FIELDSPELLZONE.getY());
        backView.setTranslateX(Zone.FIELDSPELLZONE.getX());
        backView.setTranslateY(Zone.FIELDSPELLZONE.getY());
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
