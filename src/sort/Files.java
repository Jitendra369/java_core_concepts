package sort;

public class Files implements Comparable<Files>{

    private int size;
    private String name;

    public Files(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Files{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    //    compare based on the size
    @Override
    public int compareTo(Files o) {
//        return Integer.compare(this.size, o.getSize());
        return this.name.length() > o.getName().length() ? 1 : -1;
    }
}
