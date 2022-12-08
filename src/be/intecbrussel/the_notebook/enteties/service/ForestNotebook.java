package be.intecbrussel.the_notebook.enteties.service;

import be.intecbrussel.the_notebook.enteties.animal_entities.Animal;
import be.intecbrussel.the_notebook.enteties.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.enteties.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.enteties.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.enteties.plant_entities.Plant;

import java.util.*;

public class ForestNotebook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();
    private int plantCount;
    private int animalCount;

    //constructor
    public ForestNotebook() {
    }

    //getters/setters
    public List<Carnivore> getCarnivores() {
        return carnivores;
    }


    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    //methodes
    public int getPlantCount() {
        return (int) plants.stream().count();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalCount() {
        return (int) animals.stream().count();
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) { //animals(variables)vient de la list de animals,contains marche pk je ovvereide equals ds
            //animale class
            animals.add(animal);
            animalCount++;
            switch (animal.getType()) {
                case CARNIVORE:
                    carnivores.add((Carnivore) animal);// change le type de objet a un type a l'autre casting
                    break;
                case HERBIVORE:
                    herbivores.add((Herbivore) animal);
                    break;
                case OMNIVORE:
                    omnivores.add((Omnivore) animal);
                    break;
            }
        }
    }

    public void addPlant(Plant plant) {
        if (!plants.contains(plant))//contains c'est la functions dans la collection,ca peut pas marche si je ne ovveride de equals
        // (complex type)
        {
            plants.add(plant);
            plantCount++;
        }
    }

    public void printNotebook() {
        // autre possibilite for (Animal animal: animals)
        // System.out.println(animal);

        animals.forEach(a -> System.out.println(a));//lambda forEach methode sur le collections,
        // ca prendre lambda avec un parametre, et execute
        //lambda pour chaque element du collections ,(functions qui prendre functions comme param.)
        // forEach va execute le fonction de param(lambda)pour chaque element de la collection
        plants.forEach(p -> System.out.println(p));
    }

    public void sortPlantsByName() {
        Collections.sort(plants, Comparator.comparing(Plant::getName));
    }


    public void sortAnimalsByName() {
        Collections.sort(animals, Comparator.comparing(Animal::getName));
    }

    public void setPlant(List<Plant> plants) {
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
        animals.forEach((n) -> System.out.println(n));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
        plants.forEach((n) -> System.out.println(n));
    }


}
