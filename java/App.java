import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        Cat cat = new Cat();
        Animal animal = cat;
        ((Cat) animal).meow();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        new AnimalFeeder().feed(animals);
        
    }

    private static void output(String outStr){
        System.out.println(outStr);
    }
}
