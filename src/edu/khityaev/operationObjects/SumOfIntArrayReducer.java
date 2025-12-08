package edu.khityaev.operationObjects;

import java.util.List;

public class SumOfIntArrayReducer extends ValuesReducer<Integer>{
    @Override
    public Integer reduce(List<Integer> input) {
        int res=0;
        for(int val : input){
            res+=val;
        }
        return res;
    }
}
