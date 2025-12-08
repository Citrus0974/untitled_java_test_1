package edu.khityaev.operationObjects;

public class NoPositiveIntsInArrayFilter extends Filterer<int[]>{
    @Override
    public boolean test(int[] value) {
        for(int val : value){
            if(val>0) return false;
        }
        return true;
    }
}
