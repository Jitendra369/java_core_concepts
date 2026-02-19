package designPattern.composite;

public class File implements FileSystemComponent{

    private String fileName;
    private int size;

    File(String filename, int size){
        this.fileName = filename;
        this.size = size;
    }

    public void showDetails() {
        System.out.println("file-name "+ fileName);
    }

    @Override
    public int getSize() {
        return size;
    }
}
