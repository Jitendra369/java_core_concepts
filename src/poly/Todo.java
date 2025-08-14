package poly;

import poly.inter.EmailData;

public class Todo implements EmailData {
    private String content;

    public Todo(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String getModuleType() {
        return this.getClass().getSimpleName();
    }

    public void setContent(String content) {
        this.content = content;
    }
}
