package be.intecbrussel.the_notebook.enteties.animal_entities;

public class Carnivore extends Animal {
    private double maxFoodSize;

    //constructors

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length,double maxFoodSize) {
        super(name, weight, height, length);
        this. maxFoodSize= maxFoodSize;

    }
    //getters/setters
    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore: " + super.toString();
    }

   @Override
   public AnimalType getType() {
       return AnimalType.CARNIVORE;
   }
}
