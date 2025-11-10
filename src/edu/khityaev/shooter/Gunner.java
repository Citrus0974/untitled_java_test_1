package edu.khityaev.shooter;

public class Gunner {
    private String name;
    Gun gun;


    public Gunner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void shoot(){
        if(gun == null){
            System.out.println("cannot shoot without gun!");
            return;
        } else{
            gun.shoot();
        }
    }
}
