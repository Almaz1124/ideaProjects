package java_core_example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class WriteObject {
    public static void main(String[] args){

        Car[] cars = {new Car("vaz", 741852), new Car("gaz", 963258),
        new Car("taz", 951357)};
//        Car rfv = new Car("rfv", 789456);
//        Car edc = new Car("edc", 147852);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java_core_example/car.bin"))){//поток закроется сам
//            FileOutputStream fos = new FileOutputStream("car.bin");//вариант открытия потока в паре с методом закрытия
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
            oos.writeObject(cars);// второй вариант записи массива
//            oos.writeInt(cars.length);//первый вариант записи массива
//
//            for(Car c : cars) {
//                oos.writeObject(c);
//            }

//            oos.writeObject(rfv);
//            oos.writeObject(edc);

//            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


//        File f = new File("testFile");
//        PrintWriter pw = new PrintWriter(f);
//
//        File ft = new File("C:\\Users\\User\\Desktop\\test.txt");
//        PrintWriter pw2 = new PrintWriter(ft);
//
//        pw2.println("Test 123");
//
//        pw.println("Test 1");
//        pw.println("Test 2");
//        pw.close();

