package arrays;

import dto.Person;
import service.Repository;

import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        Repository repository = new Repository();
        List<Person> personList = repository.getAllPerson();


    }
}
