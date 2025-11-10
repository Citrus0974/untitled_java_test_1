package edu.khityaev.shooter;

public abstract class Weapon {
    private int ammo;
    public Weapon(int ammo){
        if(ammo<0) throw new IllegalArgumentException();
        this.ammo=ammo;
    }

    abstract void shoot();

    public int getAmmo(){
        return ammo;
    }

    public boolean takeOneAmmo(){
        if(ammo==0) return false;
        ammo--;
        return false;
    }

    public int loadAmmo(int ammo){
        if(ammo<0) throw new IllegalArgumentException();
        int tmp=ammo;
        this.ammo=ammo;
        return tmp;
    }


}
