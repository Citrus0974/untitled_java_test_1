package edu.khityaev.structure;

import javax.annotation.processing.Filer;
import javax.swing.Box;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Flow<T> {
    private final List<T> elements;
//    private List<Object> actions = new ArrayList<>(); //список действий - макрос
    private Command<?, ?> command;

    private Flow(List<T> elements) {
        this.elements = new ArrayList<T>(elements);
    }

    public static <T> Flow<T> of(List<T> inputList){
        return new Flow<>(inputList);
    }

//    List<T> getElements() {
//        return List.copyOf(elements);
//    }

    private void appendCommand(Command<?, ?> cmd){
        if(command == null){
            this.command = cmd;
        } else {
            command.addNext(cmd);
        }
    }

    public <R> Flow<R> map(Function<T, R> fun){
        Command<T, R> map = new Map<>(fun);
        this.appendCommand(map);
        return (Flow<R>)this;
    }

    public Flow<T> filter(Predicate<T> fun){
        Command<T, T> command = new Filter<>(fun);
        this.appendCommand(command);
        return (Flow<T>) this;
    }

    public <N> N reduce(N init, BinaryOperator<N> operator){
//        List<?> res;
//        if(command==null) res = elements;
//        else{
//            res = command.applyCommand(elements);
//        }
        List<?> res = command == null ? elements : command.applyCommand(elements);
        for(Object t : res){
            init = operator.apply(init, (N)t);
        }
        return init;

        //реализация поведенческих шаблонов

        //вариант 1 - декораторы
        //добавить декораторы мап и фильтр, имплементирубщие Комманд, список которых хранится в флоу, в цикле редюса проверяется булевое значение изКонтинуе,
        // возвращаемое в объект Результат объектом интерфейса Комманд, если положительное, то присваивается из него значение результата,
        // если отрицательное - то континуе переход к следующему элементу верхнего цикла


        // вариант 2 - цепочка ответственности
        //либо в самом комманд хранится ссылка на следующий комманд - цепочка ответственности


    }
}


