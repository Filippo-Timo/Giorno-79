package filippotimo.Giorno_79.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "elementi_menu")
@DiscriminatorColumn(name = "tipo_elemento")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ElementoMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private long calories;
    @Column(nullable = false)
    private double price;

    public ElementoMenu(String name, long calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElementoMenu { " +
                "name = " + name +
                ", calories = " + calories +
                ", price = " + price +
                '}';
    }
}
