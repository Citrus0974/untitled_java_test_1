package edu.khityaev.shooter;

import edu.khityaev.annotations.ToString;
import edu.khityaev.annotations.YesOrNo;
import edu.khityaev.structure.Entity;

@ToString(YesOrNo.NO)
public class Gunner extends Entity {

    @ToString(YesOrNo.YES)
    private String name;

    @ToString(YesOrNo.NO)
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
