package thread;

import dto.Person;
import service.EmployeeRepository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompatableFeature {
    public static void main(String[] args) {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10)
                        .thenApply(n -> n * 10);

        System.out.println(future.join());
    }

    public void processEmployeeData() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Person> allPerson = employeeRepository.getAllPerson();

        CompletableFuture<Double> personFeature =
                CompletableFuture.supplyAsync(() ->
                        allPerson.stream().mapToDouble(Person::getSal).sum()
                );
        System.out.println(personFeature.join());


    }


}
