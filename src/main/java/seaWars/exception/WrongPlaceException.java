package seaWars.exception;

public class WrongPlaceException extends Exception {
    public WrongPlaceException() {
        super("Выберите другое место! " +
                "Корабль находится слишком близко по отношению к остальным!");
    }
}
