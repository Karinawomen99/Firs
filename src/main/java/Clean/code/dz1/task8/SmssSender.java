package Clean.code.dz1.task8;

public class SmssSender implements MessageSente {
    public void send (String message){
        System.out.println("Отправка sms: " + message);
    }
}
