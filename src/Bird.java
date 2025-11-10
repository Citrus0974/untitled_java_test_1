public abstract class Bird implements Singing{
    private final String voice;

    public Bird(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

//    public abstract void sing();

}
