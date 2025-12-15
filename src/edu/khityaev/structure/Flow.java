package edu.khityaev.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Flow<T> {
    private List<T> elements;

    //добавлять функции и предикаты как поля; применять их все в reduce

    private Flow(List<T> elements) {
        this.elements = new ArrayList<T>(elements);
    }

    public static <T> Flow<T> of(List<T> inputList){
        return new Flow<>(inputList);
    }

    public  <R> Flow<R> map(Function<T, R> fun){
        List<R> res = (List) elements;
        for (int i=0; i<res.size(); i++){
            res.set(i, fun.apply((elements.get(i))));
        }
        this.elements= (List) res;
        return (Flow<R>) this;
    }

    public Flow<T> filter(Predicate<T> fun){
        int origSize = elements.size();
        List<T> res = elements;
        for (int i=0; i<origSize; i++){
            if(!fun.test(elements.get(i))) elements.remove(i--);
            origSize--;
        }
        this.elements = res;
        return this;
    }

    public T reduce(T init, BiFunction<T, T, T> fun){
        for(T t : elements){
            init=fun.apply(init, t);
        }
        return init;
    }
}
