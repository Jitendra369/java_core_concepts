package designPattern.adaptor;

public class User {
    private int id;
    private String email;
    private String name;

    public User() {
    }

    public User(int id, String emial, String name) {
        this.id = id;
        this.email = emial;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmial() {
        return email;
    }

    public void setEmial(String emial) {
        this.email = emial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
