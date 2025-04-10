package dz8.Jeneric1;

public class Box <T>{
    private T item;
    public void set(T item){
        this.item =item;}
    public T get(){
        return item;}

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(25);
       System.out.println(integerBox.get()); //выводим значение
        Box<String> stringBox = new Box<>();
        stringBox.set("Good day");
        System.out.println(stringBox.get());//выводим строку
    }
    }
    

