public class Sparrow extends Bird{
    public Sparrow(){
        super("chirp");
    }
    @Override
    public void sing() {
        System.out.println(super.getVoice());
    }
}
