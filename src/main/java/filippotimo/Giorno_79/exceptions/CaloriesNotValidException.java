package filippotimo.Giorno_79.exceptions;

public class CaloriesNotValidException extends RuntimeException {
    public CaloriesNotValidException(long calories) {
        super("Il record con numero calorie " + calories + " non è valido!");
    }
}
