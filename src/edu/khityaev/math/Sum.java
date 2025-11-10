package edu.khityaev.math;

public class Sum {
    public static void main(String[] args){
            if(args==null || args.length==0){
                System.out.println("error: no args");
                return;
            }
            int res=0;
            for(int i=0; i<args.length; i++){
                res+= Integer.parseInt(args[i]);
            }
        System.out.println(res);
    }
}
