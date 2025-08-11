package Clean.code.dz1.task1.task8;

public class NotificationService {
    private MessageSente sender;

    public NotificationService(MessageSente sender) {
        this.sender = sender;
    }
    public void notify (String message){
        sender.send(message);
    }
}
