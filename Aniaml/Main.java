package Aniaml;



public class Main {

    public static void main(String[] args) {
        //把狗设配成猫
        Icat fakercat=new Adapter(new DogImpl());
        fakercat.catLooks();
        fakercat.zhuoshu();
        //把猫设配成狗
        Idog fakerdog=new Adapter(new CatImpl());
        fakerdog.dogLooks();
        fakerdog.cry();
    }

}

