package Aniaml;

public class DogImpl implements Idog {

    @Override
    public void dogLooks() {
        System.out.println("我有狗的外表");

    }

    @Override
    public void cry() {
        System.out.println("我会狗叫");

    }

}
