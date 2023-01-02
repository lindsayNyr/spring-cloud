package univ.TP4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.TP4.model.Cocktail;
import univ.TP4.repository.CocktailRespository;

import java.util.List;
import java.util.Optional;

@Service
public class CocktailService {



    final
    CocktailRespository cocktailRespository ;

    public CocktailService(CocktailRespository cocktailRespository) {
        this.cocktailRespository = cocktailRespository;
    }


    public List<Cocktail> findAll(){
        return  cocktailRespository.findAll();
    }

    public Optional<Cocktail> findById(int id){
        return cocktailRespository.findById(id);
    }

    public List<Cocktail> saveOrUpdate(Cocktail cocktail){
         cocktailRespository.save(cocktail);
        return null;
    }

   public  void delete(int id){
        cocktailRespository.deleteById(id);
   }







}