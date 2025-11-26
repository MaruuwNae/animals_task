package animals;

public class Fish extends Animal implements AnimalMove {
    public Fish() { super(); }
    public Fish(String name, int age, double weight) { super(name, age, weight); }
    public Fish(String name) { super(name); }

    @Override
    public void eat() { System.out.println(getName() + " eats small insects."); }
    @Override
    public void getVoice() { System.out.println(getName() + " is silent."); }
}
