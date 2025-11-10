package edu.khityaev.animals;

public class Sparrow extends Bird implements Singing{
    public Sparrow(){
        super("chirp");
    }
    @Override
    public void sing() {
        System.out.println(super.getVoice());
    }
}
