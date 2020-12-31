package day7.task2;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina -= 1;
        }
        if (stamina == MIN_STAMINA && countPlayers != 0) {
            countPlayers -= 1;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " +
                    (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
