package edu.khityaev.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Flow<T> {
    private List<T> elements;
//    private List<Object> actions = new ArrayList<>(); //список действий - макрос
    private Command command;

    private Flow(List<T> elements) {
        this.elements = new ArrayList<T>(elements);
    }

    public static <T> Flow<T> of(List<T> inputList){
        return new Flow<>(inputList);
    }

    public  <R> Flow<R> map(Function<T, R> fun){
//        List<R> res = (List) elements;
//        for (int i=0; i<res.size(); i++){
//            res.set(i, fun.apply((elements.get(i))));
//        }
//        this.elements= (List) res;
//        return (Flow<R>) new Flow<>(res);

        return (Flow<R>) this;
    }

    public Flow<T> filter(Predicate<T> fun){
//        int origSize = elements.size();
//        List<T> res = elements;
//        for (int i=0; i<origSize; i++){
//            if(!fun.test(elements.get(i))) elements.remove(i--);
//            origSize--;
//        }
//        this.elements = res;
//        return new Flow<>(res);
        actions.add(fun);
        return (Flow<T>) this;
    }

    public T reduce(T init, BinaryOperator<T> operator){

        up: for(Object t : elements){
            for(Object action : actions){
                if(action instanceof Predicate rule){
                    if(!rule.test(t)) continue up;
                } if(action instanceof Function function){
                    t = function.apply(t);
                }
            }
            init = operator.apply(init, (T) t);
        }
        return init;

        //реализация поведенческих шаблонов

        //вариант 1 - декораторы
        //добавить декораторы мап и фильтр, имплементирубщие Комманд, список которых хранится в флоу, в цикле редюса проверяется булевое значение изКонтинуе,
        // возвращаемое в объект Результат объектом интерфейса Комманд, если положительное, то присваивается из него значение результата,
        // если отрицательное - то континуе переход к следующему элементу верхнего цикла


        // вариант 2 - цепочка ответственности
        //либо в самом комманд хранится ссылка на следующий комманд - цепочка ответственности

//        for(T t : elements){
//            init=operator.apply(init, t);
//        }
//        return init;
    }
}


