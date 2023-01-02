package univ.TP4.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="cocktail")
public class Cocktail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;


    @Column
    private String ingredients;

    @Column
    private String nom;

    @Column
    private int difficulte;

    public Cocktail(String ingredients, String nom, int difficulte){


        this.ingredients = ingredients;
        this.nom = nom;
        this.difficulte = difficulte;

    }


    public Cocktail(){

    }

    @Override
    public String toString() {
        return "Cocktail{" +


                ", nom='" + nom + '\'' +

                '}';
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}