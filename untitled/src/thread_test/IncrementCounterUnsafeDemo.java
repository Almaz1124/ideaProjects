package thread_test;

public class IncrementCounterUnsafeDemo {

    static Integer counter = 0;
    static Integer counter2 = 0;
    private static final Object counterLock = new Object();
    private static final Object counterAnother = new Object();//3 вар. 2 объекта имеют два монитора и процесс на каждом идет не зависимо друг от друга что обеспечивает почти двойную скорость.

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> { // переопределение метода run
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment2();
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Counter: " + counter);
        System.out.println("Counter2: " + counter2);
        System.out.println("Time elapsed: " + duration);
    }
    private static void increment() {
        synchronized (counterLock) {
            counter++;
        }
    }
    private static void increment2() {
        synchronized (counterAnother) {
            counter2++;
        }
    }
//    private static void increment() {//1 вар. synchronized если прописать в сигнатуре метода, то будет синхронизирован доступ к методу
//        synchronized (thread_test.IncrementCounterUnsafeDemo.class) { //2 вар. захватывание монитора всего класса
//            counter++;
//        }
//    }
}

