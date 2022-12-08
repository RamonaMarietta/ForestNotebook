package be.intecbrussel.the_notebook.enteties.plant_entities;

import java.util.Objects;

public class Plant {

    protected String name;
    protected double height;

    //constructors

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }
    //getters/setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){

       return name;
   }
   public double getHeight(){
        return height;
   }

   public void setHeight (double height){

   }
    @Override
    public String toString() {
        return " {" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
}
