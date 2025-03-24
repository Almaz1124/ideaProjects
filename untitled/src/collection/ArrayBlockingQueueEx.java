package collection;

import java.util.concurrent.ArrayBlockingQueue;

/*ArrayBlockingQueueEx - потокобезопасная очередь с ограниченным размером (capacity restricted).
Пример работы: один или несколько потоков добавляют элементы в конец очереди,
а другие потоки забирают элемент с начала очереди.
*/
public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);//обязательно нужно указать РАЗМЕР
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);//элементы НЕ могут быть null
//        queue.offer(5);//хоть и места больше нет, но ошибка не выкинется как при случае с add

        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);//добавляет элемент в конец очереди
                    System.out.println("Producer added:  " + i + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();

        //Consumer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Integer j = queue.take();//забирает и удаляет элемент с начала очереди
                    System.out.println("Consumer consumed:  " + j + " " + queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();
    }
}
