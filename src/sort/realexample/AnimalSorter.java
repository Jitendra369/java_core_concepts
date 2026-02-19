package sort.realexample;

import java.util.Comparator;
import java.util.List;

public class AnimalSorter {
    public void sortDogs(List<Dog> dogs, Comparator<? super Dog> comparator){
        dogs.sort(comparator);
    }
}
