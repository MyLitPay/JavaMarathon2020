package seaWars.model;

import seaWars.Figure;

public class ThreeDeck extends Boat {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int[] boat1 = new int[2];
    private int[] boat2 = new int[2];
    private int[] boat3 = new int[2];

    public ThreeDeck(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        boat1[0] = x1;
        boat1[1] = y1;
        boat2[0] = x2;
        boat2[1] = y2;
        boat3[0] = x3;
        boat3[1] = y3;
    }

    @Override
    public boolean isValidBoat() {
        boolean res = isCorrectNumbers(x1, y1, x2, y2, x3, y3);
        boolean resX = (x1 == x2 && x1 == x3) || (x1 - x2 == 1 && x2 - x3 == 1) ||
                (x1 - x2 == -1 && x2 - x3 == -1);
        boolean resY = (y1 == y2 && y1 == y3) || (y1 - y2 == 1 && y2 - y3 == 1) ||
                (y1 - y2 == -1 && y2 - y3 == -1);
        return res && resX && resY;
    }

    public void setHalo(Figure[][] field) {
        super.setHalo(field, boat1);
        super.setHalo(field, boat2);
        super.setHalo(field, boat3);
    }

    public boolean isUnbrokenDeckExist(Figure[][] field) {
        return field[x1][y1] != Figure.FIRE ||
                field[x2][y2] != Figure.FIRE ||
                field[x3][y3] != Figure.FIRE;
    }

    public int[] getBoat1() {
        return boat1;
    }

    public int[] getBoat2() {
        return boat2;
    }

    public int[] getBoat3() {
        return boat3;
    }
}
