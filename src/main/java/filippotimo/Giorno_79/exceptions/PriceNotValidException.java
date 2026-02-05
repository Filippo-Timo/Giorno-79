package filippotimo.Giorno_79.exceptions;

public class PriceNotValidException extends RuntimeException {
    public PriceNotValidException(double price) {
        super("Il prezzo " + price + " non è valido!");
    }
}
