package DQ;

public class TCLFac implements Factory{
    @Override
    public television producetelevision() {
        return new TCLtelevision();
    }

    public airconditioner produceairconditioner() {
        return new TCLaircondition();
    }
}
