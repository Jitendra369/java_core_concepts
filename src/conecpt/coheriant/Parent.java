package conecpt.coheriant;

public class Parent {
    public Parent(){}

    Parent getParents(){
        System.out.println("return parent class");
        return new Parent();
    }
}
