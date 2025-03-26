package dz2;

public class Teacher {
    String name;
    String subject;
    public  Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;}
    public String getName(){return name;}
    public String getSubject(){return subject;}
    public void setName (String name){this.name = name;}
    public void setSubject (String subject){this.subject = subject;}
    public void prinInfo() {
        System.out.println( "Анна Ивановна :" + name+", Предмет:"+ subject);
    }
}
