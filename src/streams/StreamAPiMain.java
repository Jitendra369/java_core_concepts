package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPiMain {
    public static void main(String[] args) {
        List<Employee> employees = loalSampleData();

        // get name of all employee
//        employees.stream().map(Employee::getName).forEach(System.out::print);
//        long employeeCountSal5000More = employees.stream().filter(emp -> emp.getSalary() > 50000).count();
//        System.out.println(employeeCountSal5000More);
//
//        Employee employee = employees.stream().max(Comparator.comparing(e -> e.getSalary())).get();
//        System.out.println(employee);
//
//        double asDouble = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
//        System.out.println(asDouble);

//        Map<String, Employee> collect = employees.stream()
//                .collect(Collectors.toMap(x -> x.getDepartment(), x -> x));
//        System.out.println(collect);

//        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
//        System.out.println(collect);

        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect1);


    }

    private static List<Employee> loalSampleData() {
        List<Employee> employees = List.of(
                new Employee(101, "Amit", "IT", 60000, 28),
                new Employee(102, "Neha", "HR", 45000, 32),
                new Employee(103, "Rahul", "IT", 80000, 35),
                new Employee(104, "Sneha", "Finance", 70000, 30),
                new Employee(105, "Vikas", "HR", 50000, 26),
                new Employee(106, "Pooja", "Finance", 90000, 40),
                new Employee(107, "Arjun", "IT", 55000, 24),
                new Employee(108, "Kiran", "Sales", 65000, 29)
        );

        return employees;
    }
}
