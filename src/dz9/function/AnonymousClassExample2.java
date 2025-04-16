package dz9.function;

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        Runnable annonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        Thread thread = new Thread(annonymousRunnable);
        thread.start();
    }
}
