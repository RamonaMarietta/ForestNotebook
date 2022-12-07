package be.intecbrussel.the_notebook.enteties.plant_enteties;

public class Tree extends Plant {
    public Tree(String name, LeafType leafType) {
        super(name);
        this.leafType = leafType;
    }

    public Tree(String name, double height, LeafType leafType) {
        super(name, height);
        this.leafType = leafType;
    }


    private LeafType leafType;

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
