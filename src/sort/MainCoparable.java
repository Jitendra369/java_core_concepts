package sort;

import sort.realexample.FileComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCoparable {
    public static void main(String[] args) {
        List<Files> files = new ArrayList<>();
        files.add(new Files(1254,"document"));
        files.add(new Files(5475,"images"));
        files.add(new Files(3251,"pdf"));
        files.add(new Files(1021,"ppt"));

//        Collections.sort(files); // comparable example
        Collections.sort(files, new FileComparator());
        System.out.println(files);
    }
}
