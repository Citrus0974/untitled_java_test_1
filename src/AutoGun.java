public class AutoGun extends Gun{
    final int rapidFire;

    public AutoGun(){
        super(30);
        rapidFire = 30;
    }
    public AutoGun(int maxShots){
        super(maxShots);
        rapidFire=maxShots/2;
    }
    public AutoGun(int maxShots, int rapidFire) {
        super(maxShots);
        this.rapidFire = rapidFire;
    }

    @Override
    public void gunShoot() {
        for(int i=0; i<rapidFire; i++){
            super.gunShoot();
        }
    }
    public void shootFor(int sec){
        for(int i=0; i<rapidFire*sec; i++){
            super.gunShoot();
        }
    }
}
