package DQ;

public class HaierFac  implements Factory{
    public television producetelevision() {
        return new Haiertelevision();
    }

    public airconditioner produceairconditioner() {
        return new Haierairconditioner();
    }
}

