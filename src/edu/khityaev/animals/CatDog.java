package edu.khityaev.animals;

public class CatDog extends Dog implements Meowing{
    Cat cat;
    Dog dog;

    public CatDog(String name) {
       super("");
       cat = new Cat(name);
       dog = new Dog(name);
    }

    @Override
    public void meow() {
        cat.meow();
    }

    @Override
    public void gav() {
        dog.gav();
    }
}
