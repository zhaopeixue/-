package Nvwa1;

public class NW {
    public static nwperson  getPerson(String people){
        nwperson  Person=null;
        if(people.equalsIgnoreCase("M")){
            Person = new Man ();
        }else if(people.equalsIgnoreCase("W")){
            Person = new Woman ();
        }else if(people.equalsIgnoreCase("R")){
            Person = new Robot ();
        }
        return Person;
    }
}

