package edu.khityaev.operationObjects;

public class ApplyAbsNum extends Apllyable<Integer, Integer>{
    @Override
    public Integer Apply(Integer value) {
        if (value<0) return value*(-1);
        return value;
    }
}
