import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamMainClass {
    public static void main(String[] args) {

////        Convert a list of integers into a stream and print only even numbers./\
        List<Integer> listOfInteger = Stream.of(25, 12, 14, 36, 26, 25, 35, 69, 58, 75, 12, 32, 56, 58, 45, 44).toList();
//        List<Integer> collect = integerList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//        System.out.println("even number is "+ collect);
//
        List<String> listOfString = Stream.of("jtu", "pooja", "n", "nikita","vikas","pooja").toList();
//        names.stream().forEach(name -> System.out.println(name.toUpperCase()));
//
//        Stream.iterate(1, n-> n + 2)
//                .limit(10)
//                .forEach(num-> System.out.println(num));
//
//        LocalDate currentDate = LocalDate.now();
//
//        Stream.iterate(currentDate, curreDate -> curreDate.plusDays(2))
//                .limit(10)
//                .forEach(System.out::print);

////        Use `Stream.generate()`  to produce 5 random numbers between 1 and 100.
//        Random random = new Random();
//        Stream.generate(
//                ()-> 1000 + random.nextInt(9000)
//        ).limit(5)
//                .forEach(otp-> System.out.println("OTP generated "+ "OTP_"+otp));
//
//        Repository repository = new Repository();
//        List<Person> allPerson = repository.getAllPerson();

////        Convert a `Map<String, Integer>`  into a stream of keys and values.
//        Map<String, Integer> map = Map.of(
//                "Apple", 3,
//                "Banana", 5,
//                "Cherry", 2
//        );
//
//        map.entrySet().stream()
//                .forEach(entry-> System.out.println("key : "+ entry.getKey() + "value : "+ entry.getValue()));
//
//        map.keySet().stream().forEach(key-> System.out.println(key));
//        map.values().stream().forEach(value-> System.out.println(value));

////        Given a list of sentences, split them into words using `flatMap()` .
//        List<String> sentences = List.of(
//                "Java is powerful",
//                "Streams are awesome",
//                "Practice makes perfect"
//        );
//
//        System.out.println(List.of("name","is ","what"));
//
//        String names = "My name is jitendra kadu";
////        Arrays.stream(names.split(","));
//
//        List<String> scentenseList = sentences.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
////                .peek(System.out::println)
//                .collect(Collectors.toList());
//
//        System.out.println(scentenseList);
//
//        List<Order> orders = List.of(
//                new Order(1, List.of(new Product("Laptop", 50000), new Product("Mouse", 500))),
//                new Order(2, List.of(new Product("Keyboard", 1500), new Product("Monitor", 12000))),
//                new Order(3, List.of(new Product("Chair", 7000)))
//        );
//
////        faltmap requried stream
//        List<String> allProductNames = orders.stream()
//                .flatMap(order -> order.getProducts().stream())
//                .map(Product::getName)
//                .toList();
//
//
//        System.out.println(allProductNames);
//

//        Sort a list of integers in ascending and descending order.
        /*
        System.out.println("before sorting" + listOfInteger);
        List<Integer> sortedList = listOfInteger.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);

        System.out.println("before sorting string "+ listOfString);
        List<String> sortedString = listOfString.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("after sorting string " +sortedString);

        // sort the list of string using string length
        List<String> sortedListUsingLength = listOfString.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedListUsingLength);

        System.out.println("reverse sorting ");
        List<String> descendingOrderSorting = listOfString.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println("descending order sorting "+descendingOrderSorting);

        // remove duplicate string from the list
        List<String> distinct = listOfString.stream().distinct().toList();
        System.out.println("unique element "+ distinct);
        */

////        Sort a list of employees by salary (then by name if same salary)
//        Repository repository = new Repository();
//        List<Person> personList = repository.getAllPerson();
//
//        List<Person> sortedSalPerson = personList.stream()
//                .sorted(Comparator.comparing(Person::getSal).reversed().thenComparing(Person::getAge)).toList();
//        System.out.println(sortedSalPerson);
//
////        Get the top 3 highest-paid employees.
//        List<Person> top3HighestSalEmployee = personList.stream()
//                .sorted(Comparator.comparing(Person::getSal).reversed().thenComparing(Comparator.comparing(Person::getName).reversed()))
//                .limit(3).toList();
//        System.out.println("top 3 latest sal employee "+ top3HighestSalEmployee);

//        biconsumer
        BiConsumer<Integer, Integer> biConsumer = (a,b)-> System.out.println(a + b);
        biConsumer.accept(12,23);
    }
}
