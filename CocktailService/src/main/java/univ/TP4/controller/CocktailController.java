package univ.TP4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import univ.TP4.model.Cocktail;
import univ.TP4.service.CocktailService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cocktails")
public class CocktailController {

    private final CocktailService cocktailService;


    @Value("${me}")
    private String me;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Optional<Cocktail> findById(@PathVariable int id) {
        return cocktailService.findById(id);
    }


    @ResponseBody
    @GetMapping
    public List<Cocktail> findAll() {
        return cocktailService.findAll();
    }


    @PostMapping
    public List<Cocktail> save(@RequestBody Cocktail cocktail){
        return cocktailService.saveOrUpdate(cocktail);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable int id ){
         cocktailService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Cocktail cocktail) {
        System.out.println(cocktail.getNom());

        cocktailService.saveOrUpdate(cocktail);
    }


    @GetMapping (value="/cestqui")
    public String getName() {
        System.out.println("ok");
        return me;
    }


  /*  @GetMapping
    public Optional<Cocktail> findByName(@PathVariable String name){
       return cocktailService.findByName(name);
    }*/


}