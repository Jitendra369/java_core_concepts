package poly;

import poly.inter.EmailData;

public class LifeEvent implements EmailData {

    private String mistake;

    public LifeEvent(String mistake) {
        this.mistake = mistake;
    }

    public String getMistake() {
        return mistake;
    }

    public void setMistake(String mistake) {
        this.mistake = mistake;
    }

    @Override
    public String getContent() {
        return getMistake();
    }

    @Override
    public String getModuleType() {
        return this.getClass().getSimpleName();
    }
}
