package collection;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        /* LinkedList <- I|Deque <- I|Queue -> I|AbstractQueue -> PriorityQueue //
                          |
                          V
                          ArrayDeque
        Queue - очередь, хранит последовательность добавления, элементы добавляются в конец очереди. Принцип FIFO.
        Deque - двунаправленная очередь. Работает принцип FIFO и LIFO.*/

        /*LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL*/
        Queue<String> queue = new LinkedList<>();//LinkedList имплементирует интерфейсы List и Deque

        queue.add("Alice");
        queue.add("Jone");
        queue.add("Anna");
        queue.add("Bob");
        queue.offer("Kate");/*при ограниченности мест (работая в многопоточке) не возникнет Ексепшен, как с add,
        элемент просто не добавится*/

        System.out.println(queue);
        System.out.println(queue.remove());//удалиться элемент в начале очереди и выведится
        queue.remove("Anna");//удаление по значению
        queue.poll();/*можно вызвать много раз, после удаления всех элементов выведется null,
        но не выведется ошибка как при удалении с remove*/
        System.out.println(queue.element());//выведется элемент стоящий в начале очереди
        System.out.println(queue.peek());/*выводит также первый элемент, вернет null если очередь пуста,
         но не выкинет ошибки как метод element*/

        System.out.println(queue);

        /*PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP*/

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();/*хранит элементы в отсортированном виде*/
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(9);
        priorityQueue.add(0);

        System.out.println(priorityQueue);/*при выводе сортировка может отображаться не корректно,
        но при использовании сортировка внутри реализована правильно*/
        System.out.println(priorityQueue.peek());//выводит первый элемент из списка

        priorityQueue.remove();//удаляет верхний элемент, также метод pool (не выкидывает ошибку)

        System.out.println(priorityQueue);

        Deque<Integer> arrayDeque = new ArrayDeque<>();//Deque - двунаправленная очередь

        arrayDeque.add(3);
        arrayDeque.add(0);
        arrayDeque.add(8);
        arrayDeque.addFirst(15);
        arrayDeque.addLast(1);
        arrayDeque.offerFirst(22);
        arrayDeque.offerLast(-2);

        System.out.println(arrayDeque);
        arrayDeque.remove();//удаляет 1-й эл-т и соответственно removeLast, pollFirst, pollLast
        arrayDeque.getFirst();//getLast, peekFirst, peekLast

        Deque<Integer> linkeddeque = new LinkedList<>();
        linkeddeque.add(22);
        System.out.println(linkeddeque);
    }
}
