package be.intecbrussel.the_notebook.enteties.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    //constructors
    public Tree(String name, LeafType leafType) {
        super(name);
        this.leafType = leafType;
    }

    public Tree(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }
    // gettesr/setters

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                '}';
    }
}
