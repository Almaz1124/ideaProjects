package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx {
    public static void main(String[] args) throws Exception{

/*Example - 1******************************************************************/
        ArrayList<Integer> sourse = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            sourse.add(i);

        //ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> {synchList.addAll(sourse);};

//        Thread thread1 = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
        //thread1.start();
        //thread2.start();
        //thread1.join();
        //thread2.join();
        //System.out.println(synchList);

/*Example - 2******************************************************************/

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 1000; i++)
            arrayList.add(i);

        List<Integer> synchList2 = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            synchronized (synchList2) {
                Iterator<Integer> iterator = synchList2.iterator();
                while (iterator.hasNext())
                    System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () ->
            synchList2.remove(10);


        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(synchList2);

    }
}
