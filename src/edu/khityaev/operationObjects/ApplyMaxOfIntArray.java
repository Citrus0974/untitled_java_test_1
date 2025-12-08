package edu.khityaev.operationObjects;

public class ApplyMaxOfIntArray extends Apllyable<int[], Integer>{
    @Override
    public Integer Apply(int[] value) {
        int max= Integer.MIN_VALUE;
        for(int val : value){
            if(max<val) max=val;
        }
        return max;
    }
}
