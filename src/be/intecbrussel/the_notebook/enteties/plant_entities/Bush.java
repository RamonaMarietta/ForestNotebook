package be.intecbrussel.the_notebook.enteties.plant_entities;

public class Bush extends Plant{
    private String fruit;
    private LeafType leafType;

    //constructors
    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }
    //getters/setters

   public String getFruit(){
       return fruit;
   }
   public void setFruit (String fruit){

   }

    public LeafType getLeafType() {
        return leafType;
    }
    public void setLeafType (LeafType leafType){

    }

    @Override
    public String toString() {
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                '}';
    }
}
