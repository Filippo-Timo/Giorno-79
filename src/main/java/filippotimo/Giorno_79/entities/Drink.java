package filippotimo.Giorno_79.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Drink")
public class Drink extends ElementoMenu {

    @Column
    private String size;

    public Drink(String name, long calories, double price, String size) {
        super(name, calories, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink { " +
                super.getName() +
                " (" + size +
                ") " +
                super.getCalories() +
                super.getPrice() +
                '}';
    }

}
