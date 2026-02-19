package service;

import dto.Person;

import java.util.List;

public class EmployeeRepository {

    public List<Person> getAllPerson(){
        List<Person> personList = List.of(
                new Person("jittu", 32, "male", 300000,"IT"),
                new Person("neetu", 34, "female",50000,"IT"),
                new Person("pooja", 30, "female",35421421,"Bank"),
                new Person("Nikita", 28, "female",50000,"Finance")
        );
        return personList;

    }
}
