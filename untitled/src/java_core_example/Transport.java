package java_core_example;

import java.io.Serializable;

public abstract class Transport {
    protected float speed;
    private int weight;
    protected String color;
    private byte[] coordinate;
    private static int countTr;
    private String model;
    private int vin;

    public Transport(){
        countTr++;
    }
    public Transport(String Model, int Vin){
        setterMV(Model, Vin);
        countTr++;
    }
    public Transport(float speed, int weight, String color, byte[] coordinate) {
        setValues(speed, weight, color, coordinate);
//        this.speed = speed;
//        this.weight = weight;
//        this.color = color;
//        this.coordinate = coordinate;
//        setValues(speed, weight, color);
//        System.out.println(getValues());
        System.out.println(speed + "\n" + weight + "\n" + color);
        System.out.println(getValues());
        countTr++;
    }
    public static void setCountTr(){
        System.out.println("Transport: " + countTr);
    }
    public Transport(int weight, String color) {
//        this.weight = weight;
//        this.color = color;
        System.out.println(weight + "\n" + color);
    }
    public Transport(float speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        countTr++;
    }

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "";
        for (int i = 0; i < coordinate.length; i++) {
            info += coordinate[i] + ", ";
//        String info = speed + "\n" + weight + "\n" + color + "\n";
        }
        return info;
    }
    protected abstract void moveObject(float speed);
    protected abstract String stopObject();

    class Engine implements Serializable{

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }
        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }
        public void info() {
            if(isReady)
                System.out.println("Двигатель исправен");
            else
                System.out.println("Нет, двигатель не исправен. Пробег: " + km + "км");
        }
    }
    public String toString(){
        return model + " : " + vin;
    }
    public boolean equals(Object a){// можно указать Car
        Car c = (Car) a;
        return this.color == c.color;
    }
    public void setterMV(String model, int vin){
        this.model = model;
        this.vin = vin;
    }
    public String getModel(){
        return model;
    }
    public int getVin(){
        return vin;
    }
}
