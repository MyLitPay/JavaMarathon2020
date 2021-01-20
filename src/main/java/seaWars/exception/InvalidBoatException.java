package seaWars.exception;

public class InvalidBoatException extends Exception {
    public InvalidBoatException() {
        super("Некорректная лодка");
    }
}
