package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*CopyOnWriteArrayList имплементирует интерфейс List. CopyOnWriteArrayList следует использовать тогда, когда нужно
добиться потокобезопасности и если предполагается небольшое количество операций по изменению элементов
и большое кол-во по чтению.
Также есть еще CopyOnWriteArraySet, который работает по схожему сценарию.*/
public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("Anna");
        arrayList.add("Bob");
        arrayList.add("Alice");
        arrayList.add("Jone");
        arrayList.add("Pen");

        Runnable runnable1 = () -> {
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());/*итератор отработал по начальной версии листа
                и не видел создание новых копий*/
            }
        };
        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList.remove(4);//при внесении изменений создалась новая копия листа
            arrayList.add("Kate");//создалась следующая копия
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(arrayList);//вывелся последний вариант листа

        Iterator<String> i = arrayList.iterator();//вызываем итератор на листе
        while(i.hasNext()) {//запускаем цикл с проверкой наличия элемента и итерации до конца листа
            i.next();//получаем элемент
            i.remove();//и только после этого можем удалить
        }

    }
}
