package inner_interface;

import conecpt.nested_interface.Vehical;

public class Car implements Vehical.Engine {

    @Override
    public void run() {
        System.out.println("car class calling");
    }
}
