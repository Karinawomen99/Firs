package dz10.z3;

public class VolatileExample {
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread counterTread = new Thread(() -> {
            long counter = 0;
            while (!stop) {
                counter++;
            }
            System.out.println("Счетчик остановлен на: " + counter);
        });

        counterTread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}


