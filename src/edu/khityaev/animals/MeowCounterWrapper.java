package edu.khityaev.animals;

public class MeowCounterWrapper implements Meowing{

    Meowing meowing;
    int meowCount;

    public MeowCounterWrapper(Meowing meowing){
        this.meowing = meowing;
    }

    public int getMeowCount() {
        return meowCount;
    }

    @Override
    public void meow() {
        meowing.meow();
        meowCount++;
    }
}
