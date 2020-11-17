package de.htw.mobileaw.notifications;

public interface Notifications {

    /** push Notification and inform all Subscriber
     * @param notification Notification Interface have to be implemented in object */
    public void pushNotification(Notification notification);

    /** adds Subscriber to Notifications
     * @param subscriber Subscriber Interface have to be implemented in object */
    public void subscribe(Subscriber subscriber);
}
