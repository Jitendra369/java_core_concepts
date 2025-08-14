package poly;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Notification> notificationList = new ArrayList<>();

        Notification<LifeEvent> lifeEventNotification = new Notification();
        LifeEvent lifeEvent = new LifeEvent("mount-everest");
        lifeEventNotification.setEmailData(lifeEvent);
        notificationList.add(lifeEventNotification);

        Notification<Todo> todoNotification = new Notification();
        todoNotification.setEmailData(new Todo("photo-hide"));
        notificationList.add(todoNotification);

        Notification<Meeting> meetingNotification = new Notification();
        meetingNotification.setEmailData(new Meeting("nikita-meeting"));
        notificationList.add(meetingNotification);

        notificationList.stream().forEach(
                notification -> {
                    sendMailNotifcation(notification);
                }
        );


    }

    private static void sendMailNotifcation(Notification notification){
        System.out.println( "sending email for type "+ notification.getType() +" and content is : " +notification.getEmailData().getContent());
    }
}
