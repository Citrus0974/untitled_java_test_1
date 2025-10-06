public class Gun {
    public int shotsRemain;

    public Gun(int num){
        this.shotsRemain=num;
    }
    public Gun(){
        this(5);
    }

    public void gunShoot(){
        if(this.shotsRemain>0){
            System.out.println("BOOM");
            this.shotsRemain--;
        } else System.out.println("CLICK");
    }

}
