import java.util.List;

public class AnimalFeeder {

    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat(); 
            if(animal instanceof Cat){
                ((Cat) animal).meow();
            }
        });
    }
}