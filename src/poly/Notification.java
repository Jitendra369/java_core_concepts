package poly;

import poly.inter.EmailData;

import java.util.Date;

public class Notification<T extends EmailData> {
    private Date startDate;
    private Date endDate;
    private String content;
    private EmailData emailData;
    private Class<T> type;


    public void setType(Class<T> type) {
        this.type = type;
    }

    public Class<? extends EmailData> getType() {
        return type;
    }


    public EmailData getEmailData() {
        return emailData;
    }

    public void setEmailData(EmailData emailData) {
        this.emailData = emailData;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
