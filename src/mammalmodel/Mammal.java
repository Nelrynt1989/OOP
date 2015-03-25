/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1405166
 */
public class Mammal {

    private String name;
    private String species;
    private String latinName;
    private String description;

    public Mammal() {

    }

    public Mammal(String newName, String newSpecies, String newLatinName, String newDescription) {
        name = newName;
        species = newSpecies;
        latinName = newLatinName;
        description = newDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    public String getLatin() {
        return latinName;
    }

    public void setLatin(String newLatinName) {
        latinName = newLatinName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void printDetails() {
        System.out.format("Name: %s \nSpecies: %s \nLatin Name: %s \nDescription: %s \n \n", name, species, latinName, description);
    }
}
