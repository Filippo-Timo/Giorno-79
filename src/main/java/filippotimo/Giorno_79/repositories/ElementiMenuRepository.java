package filippotimo.Giorno_79.repositories;

import filippotimo.Giorno_79.entities.ElementoMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElementiMenuRepository extends JpaRepository<ElementoMenu, Long> {

    ElementoMenu findById(long id);

    List<ElementoMenu> findByTipoElemento(String tipoElemento);

    List<ElementoMenu> findByName(String name);

    List<ElementoMenu> findByCalories(long calories);

    List<ElementoMenu> findByPrice(double price);

    List<ElementoMenu> findByTipoElementoAndName(String tipoElemento, String name);

    boolean existsByName(String name);

}
