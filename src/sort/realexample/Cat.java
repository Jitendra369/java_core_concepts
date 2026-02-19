package sort.realexample;

public class Cat extends Animal{
    private boolean isIndore;

    public Cat(String name, boolean isIndore) {
        super(name);
        this.isIndore = isIndore;
    }

    public boolean isIndore() {
        return isIndore;
    }

    public void setIndore(boolean indore) {
        isIndore = indore;
    }
}
