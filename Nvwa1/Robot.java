package Nvwa1;

public class Robot extends nwperson{
    public void eat() {
        System.out.println("机器人吃东西..");
        super.eat();
    }
    @Override
    public void run() {
        System.out.println("机器人跑步..");
        super.run();
    }
}

