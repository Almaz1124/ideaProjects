package java_core_example;

public class Truck extends Transport{

    public Engine engine = new Engine();

    public Truck(int weigth, String color) {
        super(weigth, color);
    }

    public boolean isLoaded;
    public static int countTruck;

    public Truck(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        getLoaded();
        System.out.println(stopObject());
        countTruck++;
    }
    public void setCountTruck(){
        System.out.println("Truck: " + countTruck);
    }
    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }
    public void getLoaded() {
        if(isLoaded){
            System.out.println("Грузовик загружен.");
        }
        else{
            System.out.println("Грузовик не загружен.");
        }
    }

    @Override
    protected String getValues() {
        return super.getValues();
    }

    @Override
    protected void moveObject(float speed) {
        System.out.println("Грузовик едет со скоростью: " + speed);
    }

    @Override
    protected String stopObject() {
        this.speed = 0;
        return "Грузовик остановился";
    }
}

