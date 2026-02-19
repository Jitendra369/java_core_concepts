package sort.realexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                new Dog("Buddy", "Golden Retriever"),
                new Dog("Max", "Labrador"),
                new Dog("Charlie", "Beagle")
        );

        AnimalSorter animalSorter = new AnimalSorter();
        animalSorter.sortDogs(dogs, new DogComparator());

        Comparator<Animal> animalComparator = Comparator.comparing(Animal::getName);
        Comparator<Dog> dogComparator = Comparator.comparing(Dog::getBreed);
    }
}
