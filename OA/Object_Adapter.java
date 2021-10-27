package OA;

public class Object_Adapter extends Object_MysqlOperater {
    private Object_SecretMoudle object_secretMoudle;

    public Object_Adapter() {
        object_secretMoudle=new Object_SecretMoudle();
    }

    public void encrypt(){
        object_secretMoudle.getencrypt();
    }
}

