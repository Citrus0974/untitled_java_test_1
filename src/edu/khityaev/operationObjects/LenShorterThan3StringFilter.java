package edu.khityaev.operationObjects;

public class LenShorterThan3StringFilter extends Filterer<String>{
    @Override
    public boolean test(String value) {
        return value.length() < 3;
    }
}
