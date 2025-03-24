package lambda_example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Stream - это последовательность элементов, поддерживающих последовательные и параллельные операции над ними.*/
public class streamExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("world");
        list.add("!!!");
        list.add("Good");
        list.add("by");
        list.add("!");

//        for(int i = 0; i < list.size(); i++)
//            list.set(i, String.valueOf(list.get(i).length()));

        List<Integer> list2 = list.stream().map(element -> element.length())
                        .collect(Collectors.toList());

        System.out.println(list2);

        Set<Integer> set = list.stream().map(e -> e.length())
                .collect(Collectors.toSet());//передаем в лист и получаем отсортированный список с исключением дублей

        System.out.println(set);

        List<String> list3 = list2.stream().map(e -> e.toString())
                .collect(Collectors.toList());//получаем цифры в типе Стринг

        System.out.println(list3);

        list3.stream().forEach(e -> System.out.print(e + " "));//вывод с доп пробелом
        list3.stream().forEach(System.out::print);//более короткая запись вывода
        System.out.println();
        list3.stream().forEach(e -> PrintTest.print123(e + "0"));//обращение к единственному методу класса
        list3.stream().forEach(PrintTest::print123);//аналогичная более короткая запись без дополнений
        System.out.println();

        List<String> list4 = list.stream().filter(e -> e.length() < 7)
                .collect(Collectors.toList());
        System.out.println(list4);

        list.stream().filter(e -> e.length() < 6).forEach(e -> System.out.print(e + ", "));
        System.out.println("\n");

        int result = list2.stream().reduce((accumulator, element) ->
                accumulator*element).get();//5 * 5 = 25 * 3...//list2 не должен быть пустым, иначе будет ошибка
        System.out.println(result);//600

        int result2 = list2.stream().reduce(2, (a, e) ->//2-й вариант
                a * e);//без get т.к. в а изначально присвоили = 1 и не будет значения 0
        System.out.println(result2);//1200

        String[] array = {"flatMap", "служат", "для", "преобразования", "в примитивный", "стрим"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
class PrintTest {
    static void print123(String i) {
        System.out.print("<" + i + "> ");
    }
}
