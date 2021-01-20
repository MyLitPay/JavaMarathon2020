package seaWars.model;

import seaWars.Figure;

public abstract class Boat {
    public void hit() {
        System.out.println("---------- Попадание! Корабль поврежден");
    }

    public void kill() {
        System.out.println("------------------- Утопил! ---------------");
    }

    public abstract boolean isValidBoat();

    public boolean isCorrectNumbers(int... a) {
        boolean result = true;
        for (int num : a) {
            if (num < 0 || num > 9) {
                result = false;
                break;
            }
        }
        return result;
    }

    public void setHalo(Figure[][] field, int[] boat) {
        int x = boat[0];
        int y = boat[1];

        if (x < 9) {
            if (field[x + 1][y] != Figure.BOAT) {
                field[x + 1][y] = Figure.HALO;
            }
        }
        if (x > 0) {
            if (field[x - 1][y] != Figure.BOAT) {
                field[x - 1][y] = Figure.HALO;
            }
        }
        if (y < 9) {
            if (field[x][y + 1] != Figure.BOAT) {
                field[x][y + 1] = Figure.HALO;
            }
        }
        if (y > 0) {
            if (field[x][y - 1] != Figure.BOAT) {
                field[x][y - 1] = Figure.HALO;
            }
        }
        if (x < 9 && y < 9) {
            if (field[x + 1][y + 1] != Figure.BOAT) {
                field[x + 1][y + 1] = Figure.HALO;
            }
        }
        if (x < 9 && y > 0) {
            if (field[x + 1][y - 1] != Figure.BOAT) {
                field[x + 1][y - 1] = Figure.HALO;
            }
        }
        if (x > 0 && y < 9) {
            if (field[x - 1][y + 1] != Figure.BOAT) {
                field[x - 1][y + 1] = Figure.HALO;
            }
        }
        if (x > 0 && y > 0) {
            if (field[x - 1][y - 1] != Figure.BOAT) {
                field[x - 1][y - 1] = Figure.HALO;
            }
        }
    }
}
