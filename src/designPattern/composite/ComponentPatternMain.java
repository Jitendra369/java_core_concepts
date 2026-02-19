package designPattern.composite;

public class ComponentPatternMain {
    public static void main(String[] args) {
        File file = new File("Resume.pdf", 1020);
        File file1 = new File("Health-chart.pdf",2012);

        Folder documentFolder = new Folder("Document");
        documentFolder.add(file);

        Folder healthFolder = new Folder("Health");
        healthFolder.add(file1);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(documentFolder);
        rootFolder.add(healthFolder);

        rootFolder.showDetails();
        System.out.println("total size is "+ rootFolder.getSize());

    }
}
