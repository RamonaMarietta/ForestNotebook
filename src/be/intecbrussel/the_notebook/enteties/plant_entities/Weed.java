package be.intecbrussel.the_notebook.enteties.plant_entities;

public class Weed extends Plant {

    private double area;

    //constructors

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height)
    {
        super(name, height);
    }

    //getters/setters
    public double getArea() {

        return area;
    }
    public void setArea(double amount){

    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                '}';
    }
}
