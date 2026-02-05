package filippotimo.Giorno_79.services;

import filippotimo.Giorno_79.entities.ElementoMenu;
import filippotimo.Giorno_79.exceptions.CaloriesNotValidException;
import filippotimo.Giorno_79.exceptions.NameNotValidException;
import filippotimo.Giorno_79.exceptions.PriceNotValidException;
import filippotimo.Giorno_79.repositories.ElementiMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementiMenuService {

    private final ElementiMenuRepository elementiMenuRepository;


    @Autowired
    public ElementiMenuService(ElementiMenuRepository elementiMenuRepository) {
        this.elementiMenuRepository = elementiMenuRepository;
    }

//   *************************************** QUI INIZIANO I METODI ***************************************

    public void saveElementoMenu(ElementoMenu newElementoMenu) {
        if (elementiMenuRepository.existsByName(newElementoMenu.getName()))
            throw new NameNotValidException(newElementoMenu.getName());
        if (newElementoMenu.getPrice() <= 0) throw new PriceNotValidException(newElementoMenu.getPrice());
        if (newElementoMenu.getCalories() < 0) throw new CaloriesNotValidException(newElementoMenu.getCalories());
        if (newElementoMenu.getName().length() < 2) throw new NameNotValidException(newElementoMenu.getName());

        this.elementiMenuRepository.save(newElementoMenu);
        System.out.println("Elemento menu salvato correttamente!");
    }

}
