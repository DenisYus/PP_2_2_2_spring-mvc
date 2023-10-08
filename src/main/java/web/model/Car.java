package web.model;

public class Car {
    public String model;
    private final int maxSpeed;
    private final int year;


    public Car(String model, int maxSpeed, int year) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;

    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }


}
