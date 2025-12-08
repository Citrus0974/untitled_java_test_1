package edu.khityaev.operationObjects;

public class PositiveIntOnlyFilter extends Filterer<Integer>{
    @Override
    public boolean test(Integer value) {
        return value > 0;
    }
}
