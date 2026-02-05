package filippotimo.Giorno_79.exceptions;

public class NameNotValidException extends RuntimeException {
    public NameNotValidException(String name) {
        super("Il record con name: " + name + " non è valido o è già esistente!");
    }
}
