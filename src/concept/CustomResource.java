package concept;

public class CustomResource implements AutoCloseable{

    public void performOperation(){
        System.out.println("starting connection...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("ending connection...");
        System.out.println("closing the resource ");
    }
}
