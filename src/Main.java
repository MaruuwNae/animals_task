package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex", 3, 12.5, "Beagle"),
                new Pigeon("Perry", 2, 1.0, "Grey", "Rock Pigeon"),
                new Blowfish("Finn", 1, 0.5, "Yellow")
        };

        System.out.println("== Animal Moves ==");
        for (Animal a : animals) {
            ((AnimalMove)a).move();
        }

        AnimalBehavior[] behaviors = {
                (AnimalBehavior)animals[0],
                (AnimalBehavior)animals[1],
                (AnimalBehavior)animals[2]
        };

        System.out.println("\n== Animal Sleeps ==");
        for (AnimalBehavior ab : behaviors) {
            ab.sleep();
        }

        System.out.println("\n== Animal Names ==");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}
