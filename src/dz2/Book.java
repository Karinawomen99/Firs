package dz2;

public class Book {
    String title;
    String author;
    public  Book(String title, String author) {
        this.title = title;
        this.author = author;}
    public String getTitle (){return title;}
    public String getAuthor(){return author;}
    public void setTitle(String title){this.title =title ;}
    public void setAuthor(String author){this.author =author ;}
    public void printInfo(){
        System.out.println("Название:" + title +", Автор :"+ author);
    }
}
