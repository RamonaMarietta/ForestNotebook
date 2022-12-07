package be.intecbrussel.the_notebook.enteties.plant_enteties;

import java.util.Objects;

public class Plant {

    protected String name;
    protected double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }
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




}
