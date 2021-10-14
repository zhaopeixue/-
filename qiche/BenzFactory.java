package qiche;

public class BenzFactory implements CarFactory {
    public Car produceCar() {
        Car car = new Benz();
        return car;
    }
}