package animals;

public class Mammal extends Animal implements AnimalMove {
    public Mammal() { super(); }
    public Mammal(String name, int age, double weight) { super(name, age, weight); }
    public Mammal(String name) { super(name); }

    @Override
    public void eat() { System.out.println(getName() + " eats food."); }
    @Override
    public void getVoice() { System.out.println(getName() + " makes a sound."); }
}
