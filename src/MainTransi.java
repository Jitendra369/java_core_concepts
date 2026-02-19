import conecpt.User;

import java.io.*;

public class MainTransi {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("jittu", "password");

        ObjectOutputStream oas  = new ObjectOutputStream(
                new FileOutputStream("user.ser")
        );

        oas.writeObject(user);
        oas.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.ser"));
        User descuser =  (User) objectInputStream.readObject();
        objectInputStream.close();


        System.out.println(descuser);
    }
}
