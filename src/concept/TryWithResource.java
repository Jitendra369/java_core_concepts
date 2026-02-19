package concept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        traditionTryCatchBlock();
        tryWithResource();
    }

    private static void traditionTryCatchBlock() {
        BufferedReader bf = null;
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\interview\\links.txt";

        try {
            bf = new BufferedReader(new FileReader(filePath));
            System.out.println(bf.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bf != null) {
                try {
                    bf.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void tryWithResource() {

        try (CustomResource customResource = new CustomResource()) {
            System.out.println("inside the custom class resource block ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
