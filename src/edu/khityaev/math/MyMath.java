package edu.khityaev.math;

public class MyMath {
//    public static void main(String[] args){
//        System.out.println(edu.khityaev.math.MyMath.sum(3, 4));
//        System.out.println(edu.khityaev.math.MyMath.sum(10, 12));
//    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int arrMax(int [] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int max=arr[1];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
