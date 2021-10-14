package qiche;

public class BMWFactory implements CarFactory {
    public Car produceCar(){
        Car car=new BMW();
        return car;
    }
}
