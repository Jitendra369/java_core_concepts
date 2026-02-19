package finaldemo;

public class ChildClass extends Parent{

    public void printMessage(){
        System.out.println("child class method");
    }

    @Override
    public void getParentMethod() {
        super.getParentMethod();
    }
}
