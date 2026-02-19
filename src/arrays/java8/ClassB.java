package arrays.java8;

public class ClassB implements InterfaceA{
    @Override
    public void saveData(String data) {

    }

    @Override
    public void printData() {
//        InterfaceA.super.printData();
        System.out.println("this is my custom default interface method implementation");
    }
}
