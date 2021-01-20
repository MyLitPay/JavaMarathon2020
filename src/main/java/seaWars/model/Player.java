package seaWars.model;

import seaWars.Figure;
import seaWars.exception.InvalidBoatException;
import seaWars.exception.WrongFormatException;
import seaWars.exception.WrongPlaceException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private Figure[][] field;
    private Figure[][] enemyPlayField;
    private List<SingleDeck> singleDeckList;
    private List<DoubleDeck> doubleDeckList;
    private List<ThreeDeck> threeDeckList;
    private List<FourDeck> fourDeckList;

    private static final String FIELD_MESSAGE = "Для вывода вашего игрового поля введите: Field";

    public Player(String name) {
        this.name = name;
        field = new Figure[10][10];
        enemyPlayField = new Figure[10][10];
        singleDeckList = new ArrayList<>();
        doubleDeckList = new ArrayList<>();
        threeDeckList = new ArrayList<>();
        fourDeckList = new ArrayList<>();
        setEmptyFields();
    }

    private void setEmptyFields() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = Figure.EMPTY;
                enemyPlayField[i][j] = Figure.EMPTY;
            }
        }
    }

    public void setSingleDeck(int x, int y) throws Exception {
        SingleDeck singleDeck = new SingleDeck(x, y);
        if (singleDeck.isValidBoat()) {
            if (field[x][y] == Figure.BOAT || field[x][y] == Figure.HALO) {
                throw new WrongPlaceException();
            }
            singleDeckList.add(singleDeck);
            field[x][y] = Figure.BOAT;
            singleDeck.setHalo(field);
        } else {
            throw new InvalidBoatException();
        }
    }

    public void setDoubleDeck(int x1, int y1, int x2, int y2) throws Exception {
        DoubleDeck doubleDeck = new DoubleDeck(x1, y1, x2, y2);
        if (doubleDeck.isValidBoat()) {
            if (field[x1][y1] == Figure.BOAT || field[x1][y1] == Figure.HALO ||
                    field[x2][y2] == Figure.BOAT || field[x2][y2] == Figure.HALO) {
                throw new WrongPlaceException();
            }
            doubleDeckList.add(doubleDeck);
            field[x1][y1] = Figure.BOAT;
            field[x2][y2] = Figure.BOAT;
            doubleDeck.setHalo(field);
        } else {
            throw new InvalidBoatException();
        }
    }

    public void setThreeDeck(int x1, int y1, int x2, int y2, int x3, int y3) throws Exception {
        ThreeDeck threeDeck = new ThreeDeck(x1, y1, x2, y2, x3, y3);
        if (threeDeck.isValidBoat()) {
            if (field[x1][y1] == Figure.BOAT || field[x1][y1] == Figure.HALO ||
                    field[x2][y2] == Figure.BOAT || field[x2][y2] == Figure.HALO ||
                    field[x3][y3] == Figure.BOAT || field[x3][y3] == Figure.HALO) {
                throw new WrongPlaceException();
            }
            threeDeckList.add(threeDeck);
            field[x1][y1] = Figure.BOAT;
            field[x2][y2] = Figure.BOAT;
            field[x3][y3] = Figure.BOAT;
            threeDeck.setHalo(field);
        } else {
            throw new InvalidBoatException();
        }

    }

    public void setFourDeck(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) throws Exception {
        FourDeck fourDeck = new FourDeck(x1, y1, x2, y2, x3, y3, x4, y4);
        if (fourDeck.isValidBoat()) {
            if (field[x1][y1] == Figure.BOAT || field[x1][y1] == Figure.HALO ||
                    field[x2][y2] == Figure.BOAT || field[x2][y2] == Figure.HALO ||
                    field[x3][y3] == Figure.BOAT || field[x3][y3] == Figure.HALO ||
                    field[x4][y4] == Figure.BOAT || field[x4][y4] == Figure.HALO) {
                throw new WrongPlaceException();
            }
            fourDeckList.add(fourDeck);
            field[x1][y1] = Figure.BOAT;
            field[x2][y2] = Figure.BOAT;
            field[x3][y3] = Figure.BOAT;
            field[x4][y4] = Figure.BOAT;
            fourDeck.setHalo(field);
        } else {
            throw new InvalidBoatException();
        }
    }

    public void printField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printEnemyField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(enemyPlayField[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void enterBoats(String nameOfBoat, int count) {
        for (int i = 0; i < count; i++) {
            String num = "";

            if (count > 1) {
                switch (i) {
                    case 0:
                        num = "первого";
                        break;
                    case 1:
                        num = "второго";
                        break;
                    case 2:
                        num = "третьего";
                        break;
                    case 3:
                        num = "четвертого";
                        break;
                }
            }

            Scanner scanner = new Scanner(System.in);

            String[] coordinates, coord1, coord2, coord3, coord4;
            int x1, x2, x3, x4, y1, y2, y3, y4;

            switch (nameOfBoat) {
                case "однопалубник":
                    while (true) {
                        System.out.println(FIELD_MESSAGE);
                        System.out.print(getName() + " Введите координаты " + num + " " + nameOfBoat + "а (формат: x,y): ");
                        try {
                            String enter = scanner.nextLine();
                            if (enter.equals("Field")) {
                                printField();
                                continue;
                            }
                            coordinates = enter.trim().split(",");

                            if (coordinates.length != 2) {
                                throw new WrongFormatException();
                            }

                            int x = Integer.parseInt(coordinates[0]);
                            int y = Integer.parseInt(coordinates[1]);

                            setSingleDeck(x, y);
                            break;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "двухпалубник":
                    while (true) {
                        System.out.println(FIELD_MESSAGE);
                        System.out.print(getName() + " Введите координаты " + num + " " + nameOfBoat + "а (формат: x1,y1;x2,y2): ");
                        try {
                            String enter = scanner.nextLine();
                            if (enter.equals("Field")) {
                                printField();
                                continue;
                            }
                            coordinates = enter.trim().split(";");
                            if (coordinates.length != 2) {
                                throw new WrongFormatException();
                            }
                            coord1 = coordinates[0].split(",");
                            coord2 = coordinates[1].split(",");

                            if (coord1.length != 2 || coord2.length != 2) {
                                System.out.println("Необходимо вводить по 2 координаты через запятую");
                                continue;
                            }

                            x1 = Integer.parseInt(coord1[0]);
                            y1 = Integer.parseInt(coord1[1]);
                            x2 = Integer.parseInt(coord2[0]);
                            y2 = Integer.parseInt(coord2[1]);

                            setDoubleDeck(x1, y1, x2, y2);
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "трехпалубник":
                    while (true) {
                        System.out.println(FIELD_MESSAGE);
                        System.out.print(getName() + " Введите координаты " + num + " " + nameOfBoat + "а (формат: x1,y1;x2,y2;x3,y3): ");
                        try {
                            String enter = scanner.nextLine();
                            if (enter.equals("Field")) {
                                printField();
                                continue;
                            }
                            coordinates = enter.trim().split(";");
                            if (coordinates.length != 3) {
                                throw new WrongFormatException();
                            }
                            coord1 = coordinates[0].split(",");
                            coord2 = coordinates[1].split(",");
                            coord3 = coordinates[2].split(",");
                            if (coord1.length != 2 || coord2.length != 2 || coord3.length != 2) {
                                System.out.println("Необходимо вводить по 2 координаты через запятую");
                                continue;
                            }
                            x1 = Integer.parseInt(coord1[0]);
                            y1 = Integer.parseInt(coord1[1]);
                            x2 = Integer.parseInt(coord2[0]);
                            y2 = Integer.parseInt(coord2[1]);
                            x3 = Integer.parseInt(coord3[0]);
                            y3 = Integer.parseInt(coord3[1]);
                            setThreeDeck(x1, y1, x2, y2, x3, y3);
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "четырехпалубник":
                    while (true) {
                        System.out.println(FIELD_MESSAGE);
                        System.out.print(getName() + " Введите координаты " + num + " " + nameOfBoat + "а (формат: x1,y1;x2,y2;x3,y3;x4,y4): ");
                        try {
                            String enter = scanner.nextLine();
                            if (enter.equals("Field")) {
                                printField();
                                continue;
                            }
                            coordinates = enter.trim().split(";");
                            if (coordinates.length != 4) {
                                throw new WrongFormatException();
                            }
                            coord1 = coordinates[0].split(",");
                            coord2 = coordinates[1].split(",");
                            coord3 = coordinates[2].split(",");
                            coord4 = coordinates[3].split(",");
                            if (coord1.length != 2 || coord2.length != 2 || coord3.length != 2 || coord4.length != 2) {
                                System.out.println("Необходимо вводить по 2 координаты через запятую");
                                continue;
                            }
                            x1 = Integer.parseInt(coord1[0]);
                            y1 = Integer.parseInt(coord1[1]);
                            x2 = Integer.parseInt(coord2[0]);
                            y2 = Integer.parseInt(coord2[1]);
                            x3 = Integer.parseInt(coord3[0]);
                            y3 = Integer.parseInt(coord3[1]);
                            x4 = Integer.parseInt(coord4[0]);
                            y4 = Integer.parseInt(coord4[1]);
                            setFourDeck(x1, y1, x2, y2, x3, y3, x4, y4);
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }
        }
    }

    public boolean shoot(Player player, int x, int y) {
        int[] shootingBoat = {x, y};
        List<SingleDeck> enemySingleList = player.getSingleDeckList();
        List<DoubleDeck> enemyDoubleList = player.getDoubleDeckList();
        List<ThreeDeck> enemyThreeList = player.getThreeDeckList();
        List<FourDeck> enemyFourList = player.getFourDeckList();
        Figure[][] enemyField = player.getField();

        for (SingleDeck deck : enemySingleList) {
            if (Arrays.equals(shootingBoat, deck.getBoat())) {
                enemyField[x][y] = Figure.FIRE;
                enemyPlayField[x][y] = Figure.FIRE;
                enemySingleList.remove(deck);
                deck.kill();
                return true;
            }
        }

        for (DoubleDeck deck : enemyDoubleList) {
            if (Arrays.equals(shootingBoat, deck.getBoat1()) ||
                    Arrays.equals(shootingBoat, deck.getBoat2())) {
                enemyField[x][y] = Figure.FIRE;
                enemyPlayField[x][y] = Figure.FIRE;
                if (deck.isUnbrokenDeckExist(enemyField)) {
                    deck.hit();
                } else {
                    enemyDoubleList.remove(deck);
                    deck.kill();
                }
                return true;
            }
        }

        for (ThreeDeck deck : enemyThreeList) {
            if (Arrays.equals(shootingBoat, deck.getBoat1()) ||
                    Arrays.equals(shootingBoat, deck.getBoat2()) ||
                    Arrays.equals(shootingBoat, deck.getBoat3())) {
                enemyField[x][y] = Figure.FIRE;
                enemyPlayField[x][y] = Figure.FIRE;
                if (deck.isUnbrokenDeckExist(enemyField)) {
                    deck.hit();
                } else {
                    enemyThreeList.remove(deck);
                    deck.kill();
                }
                return true;
            }
        }

        for (FourDeck deck : enemyFourList) {
            if (Arrays.equals(shootingBoat, deck.getBoat1()) ||
                    Arrays.equals(shootingBoat, deck.getBoat2()) ||
                    Arrays.equals(shootingBoat, deck.getBoat3()) ||
                    Arrays.equals(shootingBoat, deck.getBoat4())) {
                enemyField[x][y] = Figure.FIRE;
                enemyPlayField[x][y] = Figure.FIRE;
                if (deck.isUnbrokenDeckExist(enemyField)) {
                    deck.hit();
                } else {
                    enemyFourList.remove(deck);
                    deck.kill();
                }
                return true;
            }
        }

        enemyField[x][y] = Figure.MISS;
        enemyPlayField[x][y] = Figure.MISS;
        return false;
    }

    public boolean isUnbrokenBoatExist() {
        return singleDeckList.size() > 0 ||
                doubleDeckList.size() > 0 ||
                threeDeckList.size() > 0 ||
                fourDeckList.size() > 0;
    }

    public String getName() {
        return name;
    }

    public Figure[][] getField() {
        return field;
    }

    public List<SingleDeck> getSingleDeckList() {
        return singleDeckList;
    }

    public List<DoubleDeck> getDoubleDeckList() {
        return doubleDeckList;
    }

    public List<ThreeDeck> getThreeDeckList() {
        return threeDeckList;
    }

    public List<FourDeck> getFourDeckList() {
        return fourDeckList;
    }
}
