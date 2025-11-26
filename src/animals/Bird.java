package animals;

public class Bird extends Animal implements AnimalMove {
    private String featherColor;

    public Bird() { super(); this.featherColor = "unknown"; }
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    public Bird(String name, String featherColor) { super(name); this.featherColor = featherColor; }
    public Bird(String name) { super(name); this.featherColor = "unknown"; }

    @Override
    public void eat() { System.out.println(getName() + " eats seeds."); }
    @Override
    public void getVoice() { System.out.println(getName() + " chirps."); }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() { return "Bird[name=" + getName() + ", featherColor=" + featherColor + "]"; }
}
