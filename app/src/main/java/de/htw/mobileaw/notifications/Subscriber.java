package de.htw.mobileaw.notifications;

public interface Subscriber {

    /** handle Notification when received */
    public void receive(Notification notification);

}
