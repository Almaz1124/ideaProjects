package java_core_example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* Рефлексия - это механизм исследования данных о программе во время ее выполнения. Рефлексия позволяет исследовать
информацию о полях, методах, конструкторах и других составляющих классов.
*/
public class ReflectionEx {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            NoSuchMethodException {

        Class carClass = Class.forName("java_core_example.Car");//1-й вариант создание объекта класса Класс

        //Class carClass2 = Car.class;//2-й вариант

        //Car car = new Car();
        //Class carClass3 = car.getClass();//3-й вариант
/*FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF*/
        Field someField = carClass.getField("model");//работает если поле public
        System.out.println("Type of model field = " + someField.getType());

        System.out.println("________________________________________________");

        Field[] fields = carClass.getFields();//получает все поля только public
        for (Field f : fields)
            System.out.println("Type of " + f.getName() + " = " + f.getType());

        System.out.println("________________________________________________");

        Field[] allFields = carClass.getDeclaredFields();//получает доступ ко всем полям в т.ч. private и д.р.
        for (Field f : allFields)
            System.out.println("Type of " + f.getName() + " = " + f.getType());

        System.out.println("________________________________________________");

/*MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM*/
        Method someMethod1 = carClass.getMethod("stopObject");/*только если public; если есть параметры,
        то нужно обязательно их указать: (stopObject, int.class)
        Также есть методы: getMethods(); getDeclaredMethods() и др.*/
        System.out.println("Return type of method stopObject = " +
                someMethod1.getReturnType() + ", parameter types" +
                Arrays.toString(someMethod1.getParameterTypes()));/*в данном случае метод в параметрах ничего
                не принимает, поэтому массив будет пуст*/
        System.out.println("________________________________________________");

        /* getConstructors(); getPackage(), getPackage() и д.р.*/
    }
}