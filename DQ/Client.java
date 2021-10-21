package DQ;

public class Client {
    public static void main(String[] args){
        try{

            Factory factory;
            television tv;
            airconditioner ac;

            factory = (Factory) XMLUtil.getBean();
            tv = factory.producetelevision();
            tv.made();

            ac = factory.produceairconditioner();
            ac.made();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
