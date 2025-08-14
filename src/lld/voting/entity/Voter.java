package lld.voting.entity;

public class Voter {
    private String name;
    private int adharnumber;

    public String getName() {
        return name;
    }

    public Voter(String name, int adharnumber) {
        this.name = name;
        this.adharnumber = adharnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdharnumber() {
        return adharnumber;
    }

    public void setAdharnumber(int adharnumber) {
        this.adharnumber = adharnumber;
    }
}
