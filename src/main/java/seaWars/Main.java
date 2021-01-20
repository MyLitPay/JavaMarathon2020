package seaWars;

import seaWars.model.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Player 1");
        player1.enterBoats("однопалубник", 4);
        player1.enterBoats("двухпалубник", 3);
        player1.enterBoats("трехпалубник", 2);
        player1.enterBoats("четырехпалубник", 1);

        Player player2 = new Player("Player 2");
        player2.enterBoats("однопалубник", 4);
        player2.enterBoats("двухпалубник", 3);
        player2.enterBoats("трехпалубник", 2);
        player2.enterBoats("четырехпалубник", 1);


        if ((int) (Math.random() * 2) == 0) {
            move(player1, player2);
        } else {
            move(player2, player1);
        }
    }

    public static void move(Player active, Player passive) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Игрок " + active.getName() + ". Стреляйте! (формат: x,y): ");
            String s = scanner.nextLine();
            if (s.equals("Field")) {
                active.printEnemyField();
            }
            String[] array = s.trim().split(",");

            if (array.length != 2) {
                if (!s.equals("Field")) {
                    System.out.println("Неверные координаты. " +
                            "Необходимо ввести 2 координаты через запятую");
                }
                continue;
            }
            int x = Integer.parseInt(array[0]);
            int y = Integer.parseInt(array[1]);

            if (active.shoot(passive, x, y)) {
                active.printEnemyField();
                if (!passive.isUnbrokenBoatExist()) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("УРА!!! " + active.getName() + " победил!!!");
                    scanner.close();
                    return;
                }
            } else {
                System.out.println("--------------- Промах!");
                active.printEnemyField();
                break;
            }
        }
        move(passive, active);
    }


}
