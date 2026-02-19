package streams;

import dto.Person;
import service.EmployeeRepository;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Person> personList = employeeRepository.getAllPerson();

//        personList.stream().forEach(x-> System.out.println(x.getName()));

        // find the maximum in the list
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maxElement = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("max element is "+ maxElement.get());

        Integer i = list.stream().max(Integer::compare).orElseThrow();

        /*here we override the method reference
        public static int compare(int x, int y) {
            return (x < y) ? -1 : ((x == y) ? 0 : 1);
        }*/

     /*   comparator compare method
        int compare(T o1, T o2);*/
        System.out.println("max element is "+ i);

        // count string with prefix A
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long count = names.stream().filter(x -> x.startsWith("A")).count();
        System.out.println("total string with prefix A is "+ count);

        // find non-repeating character in string
        String input = "swiss";

        Optional<Character> firstNonRepeatingChar = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();

        System.out.println("first non-repeating char"+ firstNonRepeatingChar.get());

        // sum of number list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("total sum is "+ sum);

        // check if any string matching the condition
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");

        boolean b = strings.stream().anyMatch(x -> x.contains("API"));
        System.out.println("match found "+ b);

        // find duplicate
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> integers = new HashSet<>();

        List<Integer> uniqueElement = numbersList.stream().filter(x -> integers.add(x)).collect(Collectors.toList());
        System.out.println(uniqueElement);

        // group the list of integer by their name
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println("group by lenght "+ collect);

        // flattern the list
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> collect1 = listOfLists.stream()
                .flatMap(lst -> lst.stream()).collect(Collectors.toList());
        System.out.println("all list");

//        combine the string
        List<String> combineWords  = Arrays.asList("Stream", "API", "is", "powerful");
        String finalString  = combineWords.stream().collect(Collectors.joining(" "));
        System.out.println("after joining "+ finalString);

        String combineREduce = combineWords.stream().reduce("", (x1, x2) -> x1 + " " + x2).trim();
        System.out.println(combineREduce);

        BiFunction<Integer, Integer, Integer> comparebiFunction =  (s1, s2)-> Integer.compare(s1, s2);
        List<String> list1= Arrays.asList("Java", "Stream", "API", "Development");
        Optional<String> maxLengthOptional = list1.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst();
        System.out.println("maximum length is "+ maxLengthOptional.get());

        Optional<String> maxLen = list1.stream().max(Comparator.comparingInt(String::length));
        System.out.println(maxLen);

        String name = "jitendra kadu";
        Map<Character, Long> charFequencyMap = name.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        charFequencyMap.entrySet().stream().forEach( m -> System.out.println(
                m.getKey() + " " + m.getValue()
        ));

        name.chars().forEach(x-> System.out.println(x));

        // average of the numbers
        List<Integer> numb = Arrays.asList(10, 20, 30, 40, 50);
        double average = numb.stream()
                .mapToInt(g -> g.intValue())
                .average()
                .orElseThrow();

        System.out.println("average is "+ average);

        // count words

        List<String> countWords = Arrays.asList("Java", "Stream", "API");
        Map<String, Integer> collect2 = countWords.stream().collect(Collectors.toMap(word -> word, String::length));
        System.out.println(collect2);

        Map<Integer, List<String>> collect3 = countWords.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect3);

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect4 = numList.stream().collect(Collectors.partitioningBy(vale -> vale % 2 == 0));
        System.out.println(collect4);

//        collect4.get(true).stream()
        // nth largest element in the list
        List<Integer> numberList = Arrays.asList(10, 20, 50, 40, 30);
        Integer thirdLargest = numList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("third largest element "+ thirdLargest);

        List<String> palidromString = Arrays.asList("radar", "level", "world", "java");
        List<String> paliString = palidromString.stream().filter(
                str -> str.equals(new StringBuffer(str).reverse().toString())
        ).collect(Collectors.toList());

        System.out.println(paliString);
        List<String> reverseString = palidromString.stream().map(m -> new StringBuilder(m).reverse().toString()).toList();
        System.out.println("reverse string "+ reverseString);

        List<Person> list2 = employeeRepository.getAllPerson().stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(list2);
        List<Person> allPerson = employeeRepository.getAllPerson();
        List<Person> list3 = allPerson.stream().sorted(Comparator.comparing(Person::getAge).reversed()).limit(3).toList();
        System.out.println(list3);

        Map<String, List<Person>> collect5 = allPerson.stream().collect(Collectors.groupingBy(Person::getDepartment));
        System.out.println(collect5);


        Map<Integer, List<String>> collect6 = allPerson.stream().collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.mapping(e -> e.getName(), Collectors.toList())));
        System.out.println(collect6);


    }
}
