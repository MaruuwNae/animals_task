package animals;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String breed;

    public Dog() { super(); }
    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }
    public Dog(String name, String breed) { super(name); this.breed = breed; }

    @Override
    public void eat() { System.out.println(getName() + " eats dog food."); }
    @Override
    public void getVoice() { System.out.println(getName() + " barks."); }
    @Override
    public void sleep() { System.out.println(getName() + " sleeps in a kennel."); }
    @Override
    public void move() { System.out.println(getName() + " runs."); }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() { return "Dog[name=" + getName() + ", breed=" + breed + "]"; }
}
