public class Time {
    public int seconds = 0;


    @Override
    public String toString(){
        String out = "";
        int tmp = seconds%86400;
        out = (int)tmp/3600 + ":";
        tmp%=3600;
        out = out + (int)tmp/60 + ":";
        tmp%=60;
        return out+tmp;
    }
}
