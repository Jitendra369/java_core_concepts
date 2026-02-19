package inner_interface;

public class Main {
    public static void main(String[] args) {
        Vehical.Engine vehical = (Vehical.Engine) new Car();
        if (vehical instanceof  Car){

        }
    }
}
