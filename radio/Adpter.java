package radio;

public class Adpter  extends MASK{
    private WindowsMedia windowsMedia;
    private RealPlayer realPlayer;
    public Adpter(){
        windowsMedia=new WindowsMedia();
        realPlayer=new RealPlayer();
    }
    public void mediaPlayer(){
        windowsMedia.play();
    };
    public void realPlayer(){
        realPlayer.play();
    };
}
