package Clean.code.dz1.task8;

public class EmailSender implements MessageSente {
    public void send(String message){
        System.out.println("Отправка email: " + message);
    }
}
