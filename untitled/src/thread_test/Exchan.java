package thread_test;

import java.util.concurrent.Exchanger;

public class Exchan {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> ex = new Exchanger<String>();//обмен данными, в данном случае переменных message
        new Thread(new Run1(ex)).start();
        new Thread(new Run2(ex)).start();

    }
}
class Run1 implements Runnable {
    Exchanger<String> exchanger;
    String message;

    Run1(Exchanger<String> ex) {
        this.exchanger = ex;
        message = "Hello Run1";
    }
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("Run1: " + message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class Run2 implements Runnable {
    Exchanger<String> exchanger;
    String message;

    Run2(Exchanger<String> ex) {
        this.exchanger = ex;
        message = "Hello Run2";
    }
    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("Run2: " + message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}