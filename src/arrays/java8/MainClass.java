package arrays.java8;

public class MainClass {
    public static void main(String[] args) {

//        MyFunctionalInterface functionalInterface = () -> System.out.println("asdasd");
//        functionalInterface.saveData();

        MyFunctionalInterface functionalInterface1 = SingleMethodStaticClass::print; // here the boolean result is ignored
        functionalInterface1.saveData("hello");
    }
}
