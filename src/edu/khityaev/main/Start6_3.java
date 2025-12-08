package edu.khityaev.main;

import edu.khityaev.operationObjects.*;
import edu.khityaev.structure.Storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Start6_3 {
    public static void main(String[] args) {
        System.out.println("6.3.1");
        List<String> stringList = List.of("qwerty", "asdfg", "xz", "1234567");
        System.out.println(stringList);
        List<Integer> stringLenList = operationApplier(stringList, new ApplyStrLen());
        System.out.println(stringLenList);
        List<Integer> intList = List.of(1, -2, 7);
        System.out.println(intList);
        List<Integer> absNumList = operationApplier(intList, new ApplyAbsNum());
        System.out.println(absNumList);
        List<int[]> intMassList = new ArrayList<>();
        int[] mass1 = {1, 3, 4};
        int[] mass2 = {-3, -6, -7};
        int[] mass3 = {10, 12, 2};
        intMassList.add(mass1);
        intMassList.add(mass2);
        intMassList.add(mass3);
        List<Integer> intMassMax = operationApplier(intMassList, new ApplyMaxOfIntArray());
        System.out.println(intMassMax);
        System.out.println("map 6.3.1");
        List<String> stringList1 = map(stringList, String::toUpperCase);
        System.out.println(stringList1);
        List<String> stringList2 = map(stringList, (str)->{
            String a = str.substring(0,1).toUpperCase();
            return a.concat(str.substring(1, str.length()));
        });
        System.out.println(stringList2);
        List<String> stringList3 = filter(stringList, s-> s.length()<0);


        System.out.println("6.3.2");
        List<String> filteredStrings = filterApplier(stringList, new LenShorterThan3StringFilter());
        System.out.println(filteredStrings);
        List<Integer> positiveInts = filterApplier(intList, new PositiveIntOnlyFilter());
        System.out.println(positiveInts);
        List<int[]> intMassList2 = filterApplier(intMassList, new NoPositiveIntsInArrayFilter());
        for(int[] arr : intMassList2){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("filter 6.3.2");

        System.out.println("6.3.3");
        System.out.println(reducerApplier(stringList, new StringsConcatReducer()));
        System.out.println(reducerApplier(intList, new SumOfIntArrayReducer()));
        List<Integer> intList1 = List.of(1, 3, 4);
        List<Integer> intList2 = List.of(-5, -6, -7);
        List<Integer> intList3 = List.of(10, 12, 2);
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(intList1);
        listOfLists.add(intList2);
        listOfLists.add(intList3);
        System.out.println(reducerApplier(operationApplier(listOfLists, new ApplySizeOfIntArray()), new SumOfIntArrayReducer()));
        System.out.println("reduce 6.3.3");
        String reduced1 = reduce("", stringList, (a,b) -> a+b );
        System.out.println(reduced1);
        String reduced2 = reduce("", stringList, (a, b) -> b.length() < a.length() ? a : b);
        System.out.println(reduced2);
        String reduced3 = reduce(stringList, (a, b) -> b.length() < a.length() ? a : b).orElse((Object) "").toString();
        System.out.println(reduced3);
        String reduced4 = reduce(stringList, (a, b) -> b.length() < a.length() ? a : b).orElseThrow( () -> {throw new IllegalArgumentException();
        }).toString();
        System.out.println(reduced4);

        System.out.println("6.3.4");

    }

    public static <T, P, O extends Apllyable<T,P> > List<P> operationApplier(List<T> inputList, O operation){
        List<P> res = new ArrayList<>();
            for(T input : inputList){
                res.add(operation.Apply(input));
            }
        return res;
    }

    public static <T, R> List<R> map(List<T> lst, Function<T, R> fun){
        List<R> res = new ArrayList<>();
        for (T t: lst){
            res.add(fun.apply(t));
        }
        return res;
    }

    public static <T> List<T> filter(List<T> lst, Predicate<T> fun){
        List<T> res = new ArrayList<>();
        for (T t: lst){
            if(fun.test(t)) res.add(t);
        }
        return res;
    }

    public static <T> T reduce(T init, List<T> lst, BiFunction<T, T, T> fun){
        for(T t : lst){
            init=fun.apply(init, t);
        }
        return init;
    }

    public static <T> Storage reduce(List<T> lst, BiFunction<T, T, T> fun){
        if (lst.isEmpty()) return Storage.empty;
        T res = lst.getFirst();
//        for(T t : lst){
//            res=fun.apply(t, );
//        }
        for(int i=1; i<lst.size(); i++){
            res=fun.apply(res, lst.get(i));
        }
        return Storage.ofNullable(res);
    }


    public static <T, O extends Filterer<T> > List<T> filterApplier(List<T> inputList, O filter){
        List<T> outputList = new ArrayList<>(List.copyOf(inputList));
        for(T value : inputList){
            if(!filter.test(value)) outputList.remove(value);
        }
        return outputList;
    }

    public static <T, O extends ValuesReducer<T>> T reducerApplier(List<T> inputList, O reducer){
            return reducer.reduce(inputList);
    }

    public static <T, P  extends Collection<T>> P collectionate(List<T> inputValues){
        return null;
    }
}
