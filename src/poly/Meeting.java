package poly;

import poly.inter.EmailData;

public class Meeting implements EmailData {
    private String agenda;

    public Meeting(String agenda) {
        this.agenda = agenda;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @Override
    public String getContent() {
        return getAgenda();
    }

    @Override
    public String getModuleType() {
        return this.getClass().getSimpleName();
    }
}
