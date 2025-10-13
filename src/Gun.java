public class Gun {
    final int maxShots;
    public int shotsRemain;

    public Gun(int maxShots){
        if(maxShots<=0) throw new IllegalArgumentException("should not be negative or empty");
        this.maxShots=maxShots;
        this.shotsRemain=0;
    }
    public Gun(int maxShots, int remain){
        this.maxShots=maxShots;
        this.shotsRemain=remain;
    }
    public Gun(){
        this(5);
    }

    public int getMaxShots() {
        return maxShots;
    }

    public int getShotsRemain() {
        return shotsRemain;
    }

    public boolean isCharged(){
        if(shotsRemain==0) return false;
        else return true;
    }

    public void gunShoot(){
        if(this.shotsRemain>0){
            System.out.println("BOOM");
            this.shotsRemain--;
        } else System.out.println("CLICK");
    }
    public int reloadGun(int giveShots){
        if(giveShots<=0) throw new IllegalArgumentException("Number of shots given should not be 0 or negative");

        if(giveShots>maxShots-shotsRemain){
            int given = maxShots-shotsRemain;
//            System.out.println("Returned shots: " + (giveShots-given));
            int returnedShots = giveShots-given;
            shotsRemain=maxShots;
            return returnedShots;
        } else shotsRemain+=giveShots;
        return 0;
    }

    public int dischargeGun(){
//        System.out.println("Discharging shots: " + shotsRemain);
        int returnedShots = shotsRemain;
        shotsRemain = 0;
        return returnedShots;
    }

}
