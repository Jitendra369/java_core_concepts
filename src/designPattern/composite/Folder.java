package designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String name;

    // by taking reference of interface , we can store the file inside the folder
//     we can save as my file and folder in the folder
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent fileSystemComponent){
        components.add(fileSystemComponent);
    }

    public void removeComponent(FileSystemComponent fileSystemComponent){
        components.remove(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder "+ name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize = component.getSize();
        }
        return totalSize;
    }
}
