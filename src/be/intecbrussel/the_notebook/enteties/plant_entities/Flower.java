package be.intecbrussel.the_notebook.enteties.plant_entities;

public class Flower extends Plant{
    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    private Scent smell;
    public void  setSmell(Scent scent){
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

}
