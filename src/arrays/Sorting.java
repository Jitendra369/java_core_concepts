package arrays;

import dto.Person;
import service.EmployeeRepository;

import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Person> personList = employeeRepository.getAllPerson();


    }
}
