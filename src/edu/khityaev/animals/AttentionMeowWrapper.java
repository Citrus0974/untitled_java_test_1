package edu.khityaev.animals;

public class AttentionMeowWrapper extends Cat{
    Meowing meowing;
    String attention = "Attention! ";

    public AttentionMeowWrapper(Cat cat) {
        super(cat.name);
        this.meowing = cat;
    }




    @Override
    public void meow() {
        System.out.print(attention);
        meowing.meow();
    }
}
