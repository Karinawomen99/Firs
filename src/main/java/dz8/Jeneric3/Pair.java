package dz8.Jeneric3;

public class Pair<T,U> {
    private T first;
    private U second;
    public void setFirst(T first){
        this.first =first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer,String> pair =new Pair<>();
        pair.setFirst(67);
        pair.setSecond("hello");
        System.out.println("First:"+pair.getFirst());
        System.out.println("Second:"+pair.getSecond());


    }
}

