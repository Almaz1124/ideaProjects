package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        /* LinkedSet <- HashSet <- I|Set -> I|SortedSet -> I|NavigableSet -> TreeSet
        Set - коллекция, хранящая УНИКАЛЬНЫЕ элементы. Методы данной коллекции работают очень быстро.*/

        Set<String> set = new HashSet<>();/* В основе HashSet лежит HashMap. Ключи это элементы HashSet,
        значение - это константа-заглушка, которая не используется*/
        set.add("Anna");//внутренне вызывается метод put
        set.add("Jone");
        set.add("Alice");
        set.add("Bob");
        set.add("Sara");
        set.add(null);
        set.add("Alice");//дубликат не будет добавлен

        System.out.println(set);
        for(String s : set)
            System.out.println(s);

        System.out.println(set.contains("Bob"));

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(7);
        set1.add(0);
        set1.add(70);
        set1.add(2);
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(3);
        set2.add(300);
        set2.add(7);
        set2.add(0);
        set2.add(283);

        System.out.println(set2);

        HashSet<Integer> setNums = new HashSet<>(set1);//коллекция для объединения двух верхних коллек-й
        //setNums.addAll(set2);// union - объединение, дубликаты игнорируются
        setNums.retainAll(set2);//intersect - пересечение, записывает только повторяющиеся элементы
        //setNums.removeAll(set2);//subtract - удалить set1 и добавить то что есть в set2, но нет в set1

        System.out.println(setNums);
        System.out.println("\n");

/*TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT*/
        TreeSet<Integer> treeSet = new TreeSet<>();//в основе лежит КРАСНО-ЧЕРНОЕ дерево
        /*если элементами будут объекты, то нужно реализовать интерфейс Comparable. Если equals объекта true,
        то CompareTo должен возвращать 0 и hashCode должен быть переопределенным*/
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(1);
        //treeSet.add(null);// НЕ может быть NULL, т.к. хранение в отсортированном виде
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(1,3));//вывод с интервалом
        System.out.println("\n");

/*LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL*/
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();/*В основе лежит HashMap. Ключи это элементы
        HashSet, значение - это константа-заглушка, которая не используется. Хранит инфор-ю о порядке добавления элементов.
         */
        linkedHashSet.add(6);
        linkedHashSet.add(2);
        linkedHashSet.add(9);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
