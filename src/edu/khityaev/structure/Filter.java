package edu.khityaev.structure;

import java.util.List;
import java.util.function.Predicate;

public class Filter {
    Predicate predicate;

    public Filter(Predicate predicate) {
        this.predicate = predicate;
    }

    public List apply(List list) {
        for(Object object : list){
            predicate.test(object);
        }
        return list;
    }
}
