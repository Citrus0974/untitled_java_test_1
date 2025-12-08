package edu.khityaev.operationObjects;

import java.util.List;

public abstract class ValuesReducer<T> {
    public abstract T reduce(List<T> input);
}
