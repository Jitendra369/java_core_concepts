package finaldemo;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        ChildClass childClass = new ChildClass();
//        childClass.getParentMethod();

        Arrays.asList("jittu","vishal","rahul")
                .stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
