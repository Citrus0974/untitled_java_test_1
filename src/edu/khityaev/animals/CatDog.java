package edu.khityaev.animals;

public class CatDog extends Dog implements Meowing{
    Cat cat;
    Dog dog;

    public CatDog(String name) {
       cat = new Cat(name);
       dog = new Dog(name);
       super("");
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
