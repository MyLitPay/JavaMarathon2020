package seaWars.model;

import seaWars.Figure;

public class SingleDeck extends Boat {
    private int x;
    private int y;
    private int[] boat = new int[2];

    public SingleDeck(int x, int y) {
        this.x = x;
        this.y = y;
        boat[0] = x;
        boat[1] = y;
    }

    @Override
    public boolean isValidBoat() {
        return isCorrectNumbers(x, y);
    }

    public void setHalo(Figure[][] field) {
        super.setHalo(field, boat);
    }

    public int[] getBoat() {
        return boat;
    }
}
