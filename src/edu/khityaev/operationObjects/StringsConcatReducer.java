package edu.khityaev.operationObjects;

import java.util.List;

public class StringsConcatReducer extends ValuesReducer<String>{
    @Override
    public String reduce(List<String> input) {
        String res = "";
        for(String value : input){
            res+=value;
        }
        return res;
    }
}
