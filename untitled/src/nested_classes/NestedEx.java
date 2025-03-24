package nested_classes;
/* Nested classes - (вложенные классы): Static, INNER, LOCAL, ANONYMOUS. Static, INNER могут быть private.
Эти классы нужны тогда, когда какой-то класс нужно тесно привязать к внешнему классу, без которого он чаще всего
никому не нужен. Эти классы имеют доступ к переменным внешнего класса (в т.ч. private).
Также ВОЗМОЖНО создание вложенного Интерфейса (NESTED Interface).*/

import java_core_example.Car;

public class NestedEx extends Car {// TOP LEVEL - самый внешний класс

    public static void main(String[] args) {
        NestedEx nestedEx = new NestedEx();

    }

/*SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS*/
static class A{
    public static void main(String[] args) {

    }
}/*если он не private и не abstract, то в другом классе можно создать его объект
по адресу внешнего класса: NestedEx.A a = new NestedEx.A(); Может наследовать и быть родителем для др. класса.
Может обращаться напрямую ТОЛЬКО к static переменным внешнего класса(в т.ч.), так и обратно.
К не static переменным можно обратиться только через создание объекта того класса.*/

/*IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII*/
class B{
    public static void main(String[] args) {//НЕТ Run

    }
}/* INNER class. Для создания объекта нужно сначала создать объект внешнего класса.
    NestedEx nes = new NestedEx();
    NestedEx.B nesB = nes.new B();*/

/*LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL*/
void method(){
    class S{ //LOCAL class, не виден вне метода. Поля могут быть только final или effectively final
    public static void main(String[] args) {//НЕТ Run
    }
    }
}
}