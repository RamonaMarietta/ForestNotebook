package be.intecbrussel.the_notebook.enteties.app;

import be.intecbrussel.the_notebook.enteties.animal_entities.Animal;
import be.intecbrussel.the_notebook.enteties.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.enteties.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.enteties.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.enteties.plant_entities.*;
import be.intecbrussel.the_notebook.enteties.service.ForestNotebook;

import java.util.*;

public class NatureApp {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Set<Plant> diet = new HashSet<>();
        diet.add(new Plant("Raspberry"));
        Animal tigre = new Carnivore("Tigre", 175, 2, 1,5);
        Animal spider = new Carnivore("Spider", 0.4, 0.1, 12,0.02);
        Animal eagle1 = new Carnivore("Eagle", 0.5, 1.5, 2,3);
        Animal eagle = new Carnivore("Eagle", 0.7, 1.5, 2,2);

        Animal pig = new Omnivore("Pig", 40, 2.5, 3.5, diet);
        Animal bear = new Omnivore("Bear", 25, 7, 12, diet);

        Animal zebre = new Herbivore("Zebre", 120, 13, 15, diet);
        Animal cow = new Herbivore("Cow", 160, 2.5, 5, diet);
        Animal snail = new Herbivore("Snail", 0.25, 0.5, 0.2, diet);
        Animal rabbit = new Herbivore("Rabbit", 10, 2.5, 3.5, diet);


        List<Plant> plants = new ArrayList<>();

        Plant raspberry = new Bush("Raspberry", 0.7);
        Flower rose = new Flower("Rose", 0.4);
        Flower fern = new Flower("fern", 0.5);
        Tree pine = new Tree("Pine", LeafType.HAND);
        Weed oat = new Weed("Oat", 1);
        Tree damasco = new Tree("Damasco", LeafType.HEART);


        ForestNotebook myFirstDiscoveries = new ForestNotebook();


        myFirstDiscoveries.addAnimal(spider);
        myFirstDiscoveries.addAnimal(eagle1);
        myFirstDiscoveries.addAnimal(eagle);

        myFirstDiscoveries.addAnimal(pig);
        myFirstDiscoveries.addAnimal(bear);

        myFirstDiscoveries.addAnimal(zebre);
        myFirstDiscoveries.addAnimal(cow);
        myFirstDiscoveries.addAnimal(snail);
        myFirstDiscoveries.addAnimal(rabbit);

        myFirstDiscoveries.addPlant(raspberry);
        myFirstDiscoveries.addPlant(rose);
        myFirstDiscoveries.addPlant(fern);
        myFirstDiscoveries.addPlant(pine);
        myFirstDiscoveries.addPlant(oat);
        myFirstDiscoveries.addPlant(damasco);




        System.out.println("-----------Deel 2--------------------");
        System.out.println("............COUNT ANIMALS.................");
        int animalCount = myFirstDiscoveries.getAnimalCount();
        if (animalCount >= 9)
            System.out.println(myFirstDiscoveries.getAnimalCount());
        else
            System.out.println("Not enough animals");
        System.out.println("............COUNT PLANTS.................");
        int plantCount = myFirstDiscoveries.getPlantCount();
        if (plantCount >= 5)
            System.out.println(myFirstDiscoveries.getPlantCount());
        else
            System.out.println("Not enough animals");

        System.out.println("..........Printnotebook...................");
        myFirstDiscoveries.printNotebook();
        System.out.println("..........Printednotebook...................");

        System.out.println("..........Print Carnivore...................");
        System.out.println(myFirstDiscoveries.getCarnivores());//overide to string dans animal

        System.out.println("..........Print Omnivores...................");
        System.out.println(myFirstDiscoveries.getOmnivores());

        System.out.println("..........Print Herbivores...................");
        System.out.println(myFirstDiscoveries.getHerbivores());

        System.out.println("..........Sorted Animales and plants by name...................");
        myFirstDiscoveries.sortAnimalsByName();
        myFirstDiscoveries.sortPlantsByName();

        System.out.println("..........Printed Notebook...................");
        myFirstDiscoveries.printNotebook();

        System.out.println(".............BONUS............................");
        myFirstDiscoveries.sortAnimalsByHeight();
        myFirstDiscoveries.sortPlantsByHeight();


    }
}























