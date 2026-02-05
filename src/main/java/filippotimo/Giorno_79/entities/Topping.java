package filippotimo.Giorno_79.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
@DiscriminatorValue("Topping")
public class Topping extends ElementoMenu {

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizzas;

    public Topping(String name, long calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return super.getName() +
                " | " +
                super.getCalories() +
                " | " +
                super.getPrice();
    }

}
