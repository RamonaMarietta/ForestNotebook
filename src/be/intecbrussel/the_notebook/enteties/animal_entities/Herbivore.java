package be.intecbrussel.the_notebook.enteties.animal_entities;
import be.intecbrussel.the_notebook.enteties.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<>();//
    //constructors

    public Herbivore(String name) {
        super(name);
    }
    public Herbivore(String name,double weight, double height, double length ,Set<Plant> plantDiet){
        super(name,weight, height, length);
        this.plantDiet = plantDiet;
    }
    //getters/setters
    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }


    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet(){
        System.out.println(plantDiet);

    }


    @Override
    public String toString() {
        return "Herbivore: " + super.toString();
    }

    @Override
    public AnimalType getType() {
        return AnimalType.HERBIVORE;
    }
}
