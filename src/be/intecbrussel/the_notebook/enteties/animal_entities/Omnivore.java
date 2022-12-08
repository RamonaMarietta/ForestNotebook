package be.intecbrussel.the_notebook.enteties.animal_entities;

import be.intecbrussel.the_notebook.enteties.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet;
    private double maxFoodSize;

    //constructors

    public Omnivore(String name) {
        super(name);
    }
    public Omnivore(String name, double weight, double height, double length, Set<Plant> plantDiet) {
        super(name, weight, height, length);
        this.plantDiet = plantDiet;


    }
    //getters/setters

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    //methodes
    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }


    @Override
    public String toString() {
        return "Omnivore: " + super.toString();
    }

    @Override
    public AnimalType getType() {
        return AnimalType.OMNIVORE;
    }
}
