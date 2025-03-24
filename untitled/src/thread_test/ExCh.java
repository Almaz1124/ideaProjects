package thread_test;

import java.util.concurrent.Exchanger;

public class ExCh {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        Thread t1 = new Thread(new Runb1(ex));
        Thread t2 = new Thread(new Runb2(ex));
        t1.start();
        t2.start();


    }
}
class Runb1 implements Runnable {
    Exchanger<String> exchanger;
    String message;

    Runb1(Exchanger<String> e) {
        this.exchanger = e;
        message = "Hello Runb1";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Runb2 implements Runnable {
    Exchanger<String> exchanger;
    String message;

    Runb2(Exchanger<String> e) {
        this.exchanger = e;
        message = "Hello Runb2";
    }
    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
