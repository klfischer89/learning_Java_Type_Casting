import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // Cat cat = new Cat();
        // Animal animal = cat;
        // ((Cat) animal).meow();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        new AnimalFeeder().feed(animals);

        AnimalFeederGeneric<Cat> catFeeder = new AnimalFeederGeneric<Cat>(Cat.class);
        List<Cat> fedAnimals = catFeeder.feed(animals);
        System.out.println(fedAnimals.get(0));

        AnimalFeederGeneric<Dog> dogFeeder = new AnimalFeederGeneric<Dog>(Dog.class);
        List<Dog> fedDogs = dogFeeder.feed(animals);
        System.out.println(fedDogs.get(0));
    }

    private static void output(String outStr){
        System.out.println(outStr);
    }
}
