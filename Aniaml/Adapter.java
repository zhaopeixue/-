package Aniaml;


public class Adapter implements Icat, Idog {
    Icat cat=null;
    Idog dog=null;

    public Adapter(Icat cat) {
        this.cat=cat;
    }
    public Adapter(Idog dog) {
        this.dog=dog;
    }

    @Override
    public void dogLooks() {
        System.out.println("我是一只狗");

    }

    @Override
    public void cry() {
        cat.zhuoshu();

    }

    @Override
    public void catLooks() {
        System.out.println("我是一只猫");

    }

    @Override
    public void zhuoshu() {
        dog.cry();
    }

}
