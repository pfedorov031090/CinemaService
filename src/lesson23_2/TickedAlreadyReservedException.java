package lesson23_2;

public class TickedAlreadyReservedException extends Exception{
    public TickedAlreadyReservedException (String message) {
        super(message);
    }
}
