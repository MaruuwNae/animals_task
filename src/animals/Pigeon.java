package animals;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String species;

    public Pigeon() { super(); }
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    public Pigeon(String name, String species) { super(name); this.species = species; }

    @Override
    public void sleep() { System.out.println(getName() + " sleeps on the rooftop."); }
    @Override
    public void move() { System.out.println(getName() + " flies."); }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() { return "Pigeon[name=" + getName() + ", species=" + species + "]"; }
}
