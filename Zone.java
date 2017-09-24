public enum Zone {

    MONSTERZONE1   (282, 95),
    MONSTERZONE2   (142, 95),
    MONSTERZONE3   (3.5, 95),
    MONSTERZONE4   (-130, 95),
    MONSTERZONE5   (-268, 95),
    SPELLTRAPZONE1 (282, 252),
    SPELLTRAPZONE2 (142, 252),
    SPELLTRAPZONE3 (3.5, 252),
    SPELLTRAPZONE4 (-130, 252),
    SPELLTRAPZONE5 (-268, 252),
    EXTRADECKZONE  (-403.5, 252),
    DECKZONE       (420, 252),
    GRAVEYARDZONE  (420, 95),
    FIELDSPELLZONE (-403.5, 95);

    private final double x;
    private final double y;

    private Zone(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}