package univ.TP4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import univ.TP4.model.Cocktail;

import java.util.ArrayList;
import java.util.List;


public interface CocktailRespository extends JpaRepository<Cocktail, Integer> {


}

