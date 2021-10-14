package qiche;

public class test {
    public static void main(String[] args){
        Car car;
        BMWFactory factory = new BMWFactory();
        car=factory.produceCar();
        car.made();

    }
}

