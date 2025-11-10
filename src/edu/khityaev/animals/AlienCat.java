package edu.khityaev.animals;

public class AlienCat implements Meowing{
    String name;
    public AlienCat(){
        name = "the_unknown";
    }

    public AlienCat(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println("moew");
    }
}
