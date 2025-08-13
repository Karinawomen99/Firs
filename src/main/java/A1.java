public class A1 {
    public static void print() {
        System.out.println("Static method called!");
    }

    public static void main(String[] args) {
        A1 a = null;
        a.print();  // Что произойдёт?
    }
}