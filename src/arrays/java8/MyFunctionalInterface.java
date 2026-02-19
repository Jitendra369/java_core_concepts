package arrays.java8;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void saveData(String value);

    default void defaultmethod(){
        System.out.println("default method ");
    }
}
