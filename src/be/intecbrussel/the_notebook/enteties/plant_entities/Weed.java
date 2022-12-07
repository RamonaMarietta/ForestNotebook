package be.intecbrussel.the_notebook.enteties.plant_enteties;

public class Weed extends Plant {
    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    private double area;

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
