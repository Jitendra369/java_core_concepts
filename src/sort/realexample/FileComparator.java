package sort.realexample;

import sort.Files;

import java.util.Comparator;

public class FileComparator implements Comparator<Files> {
    @Override
    public int compare(Files o1, Files o2) {
        return Integer.compare(o1.getSize(), o2.getSize());
    }
}
