package qiche;

public class Cilent {
        public static void main(String[] args){
            try{
                CarFactory carFactory;
                Car car;
                carFactory = (CarFactory) XMLUtil.getBean();
                car =carFactory.produceCar();
                car.made();


            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

