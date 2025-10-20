import java.util.Random;

public class Cuckoo extends Bird{
    public Cuckoo(){
        super("ku-ku");
    }
    @Override
    public void sing() {
        Random random = new Random();
        int rInt = random.nextInt(1, 10);
        for(; rInt>0; rInt--) System.out.println(super.getVoice());
    }
}
