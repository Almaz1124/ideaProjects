package java_core_example;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java_core_example/car.bin"))){
//            FileInputStream fis = new FileInputStream("car.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

            Car[] cars = (Car[]) ois.readObject();

//            int carsCount = ois.readInt();
//            Car[] cars = new Car[carsCount];
//
//            for (int i = 0; i < carsCount; i++) {
//                cars[i] = (Car) ois.readObject();
//            }
            System.out.println(Arrays.toString(cars));
//            Car rfv = (Car) ois.readObject();
//            Car edc = (Car) ois.readObject();
//            System.out.println(rfv);
//            System.out.println(edc);

//            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
