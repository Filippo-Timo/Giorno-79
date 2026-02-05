package filippotimo.Giorno_79.runners;

import filippotimo.Giorno_79.entities.Topping;
import filippotimo.Giorno_79.services.ElementiMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final ElementiMenuService elementiMenuService;
    private final ApplicationContext ctx;

    @Autowired
    public MyRunner(ElementiMenuService elementiMenuService, ApplicationContext ctx) {
        this.elementiMenuService = elementiMenuService;
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {

        Topping tomato = ctx.getBean("getTomato", Topping.class);
        Topping cheese = ctx.getBean("getCheese", Topping.class);
        Topping prosciutto = ctx.getBean("getHam", Topping.class);
        Topping onions = ctx.getBean("getOnions", Topping.class);
        Topping pinapple = ctx.getBean("getPinapple", Topping.class);
        Topping salami = ctx.getBean("getSalami", Topping.class);

//        Pizza margherita = new Pizza("Margherita pizza", 1104, 4.99, List.of(tomato, cheese));
//        Pizza Hawaiian = new Pizza("Hawaiian pizza", 1024, 6.49, List.of(tomato, cheese, pinapple));
//        Pizza Salami = new Pizza("Margherita pizza", 1104, 4.99, List.of(tomato, cheese));
//        Pizza Diavola = new Pizza("Margherita pizza", 1104, 4.99, List.of(tomato, cheese));

//        elementiMenuService.saveElementoMenu(tomato);
//        elementiMenuService.saveElementoMenu(cheese);
//        elementiMenuService.saveElementoMenu(prosciutto);
//        elementiMenuService.saveElementoMenu(onions);
//        elementiMenuService.saveElementoMenu(pinapple);
//        elementiMenuService.saveElementoMenu(salami);

//        elementiMenuService.saveElementoMenu(margherita);
//        elementiMenuService.saveElementoMenu(Hawaiian);
//        elementiMenuService.saveElementoMenu(Salami);
//        elementiMenuService.saveElementoMenu(Diavola);


//        elementiMenuService.saveElementoMenu(margherita);

    }
}
