package be.intecbrussel.the_notebook.enteties.animal_entities;

import java.util.List;
import java.util.Objects;

public abstract class Animal {
    private String name;
    private double weight;
    private double height;
    private double length;

    //constructors
    public Animal(String name) {
        this.name = name;
    }


    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    //getters/setters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return " {" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0
                && Double.compare(animal.height, height) == 0
                && Double.compare(animal.length, length) == 0
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, height, length);
    }

    public abstract AnimalType getType();//sans implementation donc chaque classe doit implemonte elle
}
