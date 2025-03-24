package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_Example {
    public static void main(String[] args) {
/*AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Cat");//сохраняется порядок ввода
        arrayList1.add("Dog");
        arrayList1.add("Frog");
        arrayList1.add("Duck");
        arrayList1.add("Bear");
        arrayList1.add("Frog");
        System.out.println(arrayList1);

        List<String> myArr = arrayList1.subList(1, 4);// sublist - myArr является частью arrayList1, не отдельный объект
        myArr.add(2, "Bull");// добавление происходит в arrayList1
        System.out.println(myArr);
        System.out.println(arrayList1);
        arrayList1.set(3, "Lion");// можно менять элемент в arrayList1
        System.out.println(myArr);//изменения будут при обращении к myArr
        System.out.println(arrayList1);
        arrayList1.add(2, "fghjkl");// при обращении к элементам myArr выкинется ошибка
        System.out.println(arrayList1);// но с самой arrayList1 работать дальше можно
        //arrayList1.remove(1);
        //arrayList1.remove("Dog");//удалится только первый совпавший элемент
        //arrayList1.clear();

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.addAll(1, arrayList1);
        arrayList2.add("000");
        System.out.println(arrayList2);
        System.out.println(arrayList1.indexOf("Frog"));//индекс первого совпадения
        System.out.println(arrayList1.lastIndexOf("Frog"));//индекс последнего совпадения
        System.out.println(arrayList1.contains("Dog"));//запрос на содержание элемента
        System.out.println(arrayList1.containsAll(arrayList2));//arrayList1 содержит ли все элементы arrayList2

        List<Integer> listInt = new ArrayList<>();
        Integer[] array = {8, 2, 4, 3, -7, 12, 0, 7};
//        List<Integer> list2 = Arrays.asList(array);/*1-й вариант: сначала конвертируем массив в "список",
//        сам list2 имеет неизменную длину массива, т.к. является ее частью.
//        Массив должен быть создан по классу обертки, а не примитивными данными.*/
//        listInt.addAll(list2);//копируем в ArrayList

        for(int i : array)//2-й вариант
            listInt.add(i);
        //Collections.addAll(listInt, array);// 3-й вариант
        listInt.add(9);
        Collections.sort(listInt);

        System.out.println(listInt);
        System.out.println(Collections.binarySearch(listInt, 9));

/*LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL*/
        List<Integer> linkedList = new LinkedList<>();/*doubly - двусвязный список, singly - односвязный список.
        При двусвязном списке известны head и tail, если элемент ближе к хвосту, то поиск ведется оттуда*/
        linkedList.add(8);//сохраняется порядок ввода
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(null);

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        /*
        removeAll(Collection< ?> c) - удаляться имеющиеся во второй коллекции элементы
        removeAll(Collection< ?> c) - удаляться НЕ имеющиеся во второй коллекции элементы
        removeRange(int fromIndex, int toIndex) - удаление от одного индекса до другого
        removeIf(Predicate< ? super E> filter) - разъяснение ниже
        public void replaceAll(UnaryOperator<e> operator) - замена всех элементов на заданное значение

        А вот так например можно убрать все пробелы из строк, которые есть в коллекции:
        ArrayList< String> list = new ArrayList<>(Arrays.asList("A   ", "  B  ", "C"));
        list.replaceAll(String::trim);


        */
        /*

public boolean removeIf(Predicate< ? super E> filter)

Удаляет элементы из коллекции по заданному предикату. Cобственно предикат — эта некая функция/алгоритм/условие, на основании которой будут удалены один или несколько элементов, соответствующих заданному условию. Predicate — функциональный интерфейс (содержит всего один метод, поэтому может использоваться в виде лямбды), работает по принципу "принял один параметр — вернул boolean". По сути метод переопределяет реализацию из интерфейса Collection и реализует следующую "стратегию": он перебирает элементы и помечает те, которые соответствуют нашему Predicate; после он пробегается второй раз для удаления (и сдвига) элементов, которые были отмечены в первой итерации.

Реализуем интерфейс Predicate, который будет выдавать true, если два объекта равны:

class SamplePredicate< T> implements Predicate< T>{
  T varc1;
  public boolean test(T varc){
     if(varc1.equals(varc)){
       return true;
  }
  return false;
  }
}

В другом классе создадим ArrayList из String и объект нашего класса, который реализует Predicate:

ArrayList< String> color_list = new ArrayList<> ();
SamplePredicate< String> filter = new SamplePredicate<> ();

Запишем в переменную varc1 значение "White":

filter.varc1 = "White";

Добавим в список несколько строк:

color_list.add("White");
color_list.add("Black");
color_list.add("Red");
color_list.add("White");
color_list.add("Yellow");
color_list.add("White");

Выполним на списке метод removeIf, которому передадим наш объект с условием:

color_list.removeIf(filter);

В результате из списка будут удалены все строки со значением "White", так как наш "предикат" сравнивает их на равенство. Итоговый список: [Black, Red, Yellow].
        */
    }
}
