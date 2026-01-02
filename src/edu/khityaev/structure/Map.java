package edu.khityaev.structure;

import java.util.List;
import java.util.function.Function;

public class Map{
    Function function;
    public Map(Function function){
        this.function = function;
    }


    public List apply(List list) {
        for(Object object : list){
            function.apply(object);
        }
        return list;
    }
}
