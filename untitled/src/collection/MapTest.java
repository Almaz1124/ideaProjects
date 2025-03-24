package collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();//default: 16 бакетов, 0.75 - loadfactor (16x0.75=12 в каждой ячейке)
        /* при заполнении бакетов создается удвоенный массив в котором данные распределяются по хэшу, при достижении
        определенной пиковой нагрузки структура преобразуется в дерево.
        Если в качестве ключа передаются объекты, то equals & hashCode нужно переопределить (по полям объекта)*/

        hashMap.put(1, "Anna");//место в бакете определяется по хэшу (hashCode & (h.length-1)
        hashMap.put(2, "Alice");//Нода: 1)хэш 2)key 3)value 4)next(null || ссылка на след. ноду)
        hashMap.put(3, "Jone");
        hashMap.put(4, "Bob");
        hashMap.put(null, null);//key and value могут быть null
        hashMap.put(5, null);

        hashMap.put(6, null);

        hashMap.putIfAbsent(3, "Alic");//добавляет если только НЕТ такого ключа, т.е. проверяет перед добавлением
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Alice"));//boolean значение - поиск значения
        System.out.println(hashMap.containsKey(2));//boolean - поиск ключа
        System.out.println(hashMap.get(2));//вытащить значение по ключу
        System.out.println(hashMap.keySet());//вывод всех ключей
        System.out.println(hashMap.values());//вывод всех значений
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

/*TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT*/
        TreeMap<Double, String> treeMap = new TreeMap<>();
       /*если в качестве ключа передаются объекты, то необходимо имплементировать Comparable либо в сигнатуре создания
       TreeMap определить реализацию (new Comparator<Class>(){metod compare(){поля для сравнения}}),
       для того чтобы TreeMap понимал по каким параметрам сортировать.
       Если ключи объекты, то при поиске совпадения с containsKey сравнение будет идти с compareTo. Но если
       значения будут яв-ся объектами и поиск производить с containsValue, то сравнение произойдет
       через equals & hashCode, хорошим тоном будет всегда их переопределять.*/
        treeMap.put(3.4, "Cat");//элементы хранятся в отсортированном виде, в основе лежит КРАСНО-ЧЕРНОЕ дерево, не быстрее чем HashMap
        treeMap.put(2.1, "Dog");
        treeMap.put(7.9, "Frog");
        treeMap.put(6.3, "Cow");
        treeMap.put(0.5, "Fish");
        treeMap.put(3.7, null);//значение может быть null, а ключ НЕТ
        treeMap.put(2.2, null);

        System.out.println(treeMap);
        System.out.println(treeMap.size());
        System.out.println(treeMap.descendingMap());//вывод в обратном порядке
        System.out.println(treeMap.tailMap(5.0));//от значения вывод в сторону хвоста
        System.out.println(treeMap.headMap(5.0));//от значения вывод в сторону головы
        System.out.println(treeMap.lastEntry());//элемент в конце и firstEntry элемент в начале
        System.out.println(treeMap.containsValue("Dog"));

/*LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL*/
        LinkedHashMap<Double, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f,
                true);/* если указать true, то после вытаскивания элемента в списке он становится последним
        производительность методов ниже чем у HashMap*/
        linkedHashMap.put(4.6, "BMW");//хранится инфо о порядке добавления
        linkedHashMap.put(7.9, "Faw");
        linkedHashMap.put(3.2, "Reno");
        linkedHashMap.put(1.2, "Ford");
        linkedHashMap.put(null, null);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(4.6));//при выведении списка, элемент 4.6 станет последним в списке
        System.out.println(linkedHashMap);

/*HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH*/
        Hashtable<Double, String> hashtable = new Hashtable<>();/*устаревший synchronized класс, работает по тем же
        принципам, что и HashMap, но методы не такие быстрые. Для многопоточки есть ConcurrentHashMap*/
        hashtable.put(7.9, "Faw");//ключ и значение НЕ могут быть null даже по отдельности
        hashtable.put(3.2, "Reno");
        hashtable.put(1.2, "Ford");

        System.out.println(hashtable);

    }
}
