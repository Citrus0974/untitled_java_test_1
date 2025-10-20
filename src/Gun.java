public class Gun extends Weapon{
    final int maxAmmo;

    public Gun(int maxAmmo, int remain){
        super(remain);
        this.maxAmmo = maxAmmo;
    }
    public Gun(int maxAmmo) {
        super(0);
        this.maxAmmo=maxAmmo;
    }

    public Gun(){
        this(5, 5);
    }

    public int getMaxAmmo() {
        return this.maxAmmo;
    }

    public int getShotsRemain() {
        return super.getAmmo();
    }

    public void shoot(){
        if(super.getAmmo()>0){
            System.out.println("BOOM");
            super.takeOneAmmo();
        } else System.out.println("CLICK");
    }

    public int reloadGun(int giveShots){
        return super.loadAmmo(giveShots);
    }

    public int dischargeGun(){
        return super.loadAmmo(0);
    }
}


