package finalclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthMainClass {
    public static void main(String[] args) {

        List<String> allAppsAuthenticated = new ArrayList<>();
        allAppsAuthenticated.add("outlook");
        allAppsAuthenticated.add("gmail");
        allAppsAuthenticated.add("aws");

        // this also create an immutable list , that cannot modify
//        List<String> list = Arrays.asList("outlook", "gmail", "aws");
        Authenticate authenticate = new Authenticate("jittu","assjasd7897", allAppsAuthenticated );
        //authenticate.getAuthenticatedApps().add("OathServer");  // here we get exception

        System.out.println(authenticate);

        Authenticate authenticateCopy = new Authenticate(authenticate.getUsername(), authenticate.getPassword(), authenticate.getAuthenticatedApps());
        System.out.println(authenticateCopy);


    }
}
