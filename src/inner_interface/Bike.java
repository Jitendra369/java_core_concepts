package inner_interface;

public class Bike implements Vehical.Engine {
    @Override
    public void start() {
        System.out.println("bike class ");
    }
}
