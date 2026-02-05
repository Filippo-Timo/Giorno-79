package filippotimo.Giorno_79.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("Pizza")
public class Pizza extends ElementoMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id"))
    private List<Topping> toppings;

    public Pizza(String name, long calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza { " +
                super.toString() +
                "toppings = ( " + toppings +
                " ) " +
                '}';
    }

}
