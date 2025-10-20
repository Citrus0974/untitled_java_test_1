import java.util.Random;

public class Parrot extends Bird{
    public Parrot(String text){
        super(text);
    }
    @Override
    public void sing() {
        Random random = new Random();
        String voice = super.getVoice();
        int randLength = random.nextInt(1, voice.length());
        System.out.println(voice.substring(0, randLength));

    }
}
