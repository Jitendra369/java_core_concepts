package arrays.java8;

public interface InterfaceA {

    void saveData(String data);

    default void printData(){
        System.out.println("this is default method of interface");
    }
}
