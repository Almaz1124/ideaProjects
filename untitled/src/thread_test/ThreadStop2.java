package thread_test;

public class ThreadStop2 extends Thread{
    public static void main(String[] args) {
        System.out.println("java_core_example.Main thread started...");
        ThreadStop2 t = new ThreadStop2("ThreadStop2");
        t.start();

        try{
            Thread.sleep(30);
            t.interrupt();
            Thread.sleep(30);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("java_core_example.Main thread finished...");
    }
    ThreadStop2(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!isInterrupted()){

            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

