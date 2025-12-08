package edu.khityaev.operationObjects;

public abstract class Filterer<T> {
    public abstract boolean test(T value);
}
