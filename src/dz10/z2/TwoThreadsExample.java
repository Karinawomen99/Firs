package dz10.z2;

public class TwoThreadsExample {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> { //Первый  поток
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Второй поток
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}

