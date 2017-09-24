public abstract class Card {

    private boolean isDrawn = false;
    private boolean inGraveyard = false;
    private boolean onField = false;
    private boolean inHand = false;
    protected String name;
    protected String type;
    protected CardImage cardImage;

    public boolean getIsDrawn() {
        return isDrawn;
    }

    public boolean getInGraveyard() {
        return inGraveyard;
    }

    public boolean getOnField() {
        return onField;
    }

    public boolean getInHand() {
        return inHand;
    }

    public void setIsDrawn(boolean drawn) {
        isDrawn = drawn;
    }

    public void setInGraveyard(boolean graveyarded) {
        inGraveyard = graveyarded;
    }

    public void setOnField(boolean fielded) {
        onField = fielded;
    }

    public void setInHand(boolean handed) {
        inHand = handed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public CardImage getCardImage() {
        return cardImage;
    }

    public void setCardImage(CardImage cardImage) {
        this.cardImage = cardImage;
    }


}