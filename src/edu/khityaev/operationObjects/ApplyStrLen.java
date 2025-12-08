package edu.khityaev.operationObjects;

public class ApplyStrLen extends Apllyable<String, Integer>{

    public ApplyStrLen() {
    }

    @Override
    public Integer Apply(String value) {
        return value.length();
    }
}
