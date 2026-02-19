package conecpt.coheriant;

import superclass.Animal;

public class ChildClass extends Parent {

    @Override
    Parent getParents() {
        System.out.println("this is the child class ");
        return new ChildClass();
    }
}
