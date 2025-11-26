package animals;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    private String color;

    public Blowfish() { super(); }
    public Blowfish(String name, int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }
    public Blowfish(String name, String color) { super(name); this.color = color; }

    @Override
    public void sleep() { System.out.println(getName() + " sleeps in water."); }
    @Override
    public void move() { System.out.println(getName() + " swims slowly."); }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() { return "Blowfish[name=" + getName() + ", color=" + color + "]"; }
}
