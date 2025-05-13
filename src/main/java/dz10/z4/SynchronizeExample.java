package dz10.z4;

public class SynchronizeExample {
    static class Counter {
        private int count = 0;

        public synchronized void increament() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args)  throws  InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increament();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increament();
            }
        });
        thread2.start();
        thread1.start();
        // Ждём завершения обоих потоков
        thread1.join();
        thread2.join();

        System.out.println("Итоговое значение счетчика:" + counter.getCount());
    }
    }

