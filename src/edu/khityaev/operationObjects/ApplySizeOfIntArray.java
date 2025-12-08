package edu.khityaev.operationObjects;

import java.util.List;

public class ApplySizeOfIntArray extends Apllyable<List<Integer>, Integer>{
    @Override
    public Integer Apply(List<Integer> value) {
        return value.size();
    }
}
