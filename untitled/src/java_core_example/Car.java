package java_core_example;

import java.io.Serializable;

public class Car extends Transport implements Serializable {

    public Transport.Engine engine = new Transport.Engine();

    public String model; // transient-пропускает поле при сериализации объекта
    private int vin;

    public Car(){}
    public Car(int Vin){
        this.vin = Vin;
    }
    public Car(String Model, int Vin){
        setterMV(Model, Vin);
    }
    public Car(float speed, int weight, String color, byte[] coordinate){
        super(speed, weight, color, coordinate);
//        this.color
    }

    public Car(float speed, int weight, String color) {
        super(speed, weight, color);
    }
    protected void moveObject(float speed) {
        System.out.println("Машина едет со скоростью: " + speed);
    }

    @Override
    public String stopObject() {
        this.speed = 0;
        return "Машина остановилась";
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
