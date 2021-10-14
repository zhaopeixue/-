package Nvwa1;

public class Test {
    public static void main(String[] args) {
        nwperson Person;
        Person =NW.getPerson("M");  //女娲造男人
        Person.eat();
        Person =NW.getPerson("W"); //女娲造女人
        Person.eat();
        Person =NW.getPerson("R"); //女娲造机器人
        Person.eat();
    }
}
