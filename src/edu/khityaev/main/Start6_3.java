package edu.khityaev.main;

import edu.khityaev.structure.Flow;
import edu.khityaev.structure.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Start6_3 {
    public static void main(String[] args) {
        System.out.println("6.3.1");
        List<String> stringList = List.of("qwerty", "asdfg", "xz", "1234567", "12");
        System.out.println(stringList);
        List<Integer> intList = List.of(1, -2, 7);
        System.out.println(intList);
        List<int[]> intMassList = new ArrayList<>();
        int[] mass1 = {1, 3, 4};
        int[] mass2 = {-3, -6, -7};
        int[] mass3 = {10, 12, 2};
        intMassList.add(mass1);
        intMassList.add(mass2);
        intMassList.add(mass3);
        System.out.println("map 6.3.1");
        List<String> stringList1 = map(stringList, String::toUpperCase);
        System.out.println(stringList1);
        List<String> stringList2 = map(stringList, (str)->{
            String a = str.substring(0,1).toUpperCase();
            return a.concat(str.substring(1, str.length()));
        });
        System.out.println(stringList2);
        List<String> stringList3 = filter(stringList, s-> s.length()<0);
        List<String> numstrlist = List.of("123", "2", "5", "7");
        List<Integer> integerList = map(numstrlist, Integer::parseInt);


        System.out.println("6.3.2");
        System.out.println("filter 6.3.2");
        int xReduced = reduce(0, integerList, (s, y) -> s+y);
        System.out.println(xReduced);

        System.out.println("6.3.3");
        List<Integer> intList1 = List.of(1, 3, 4);
        List<Integer> intList2 = List.of(-5, -6, -7);
        List<Integer> intList3 = List.of(10, 12, 2);
        List<List<Integer>> listOfLists = List.of(intList1, intList2, intList3);
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

        int res;
        res = Flow.of(stringList).filter(s-> s.matches("\\d+")).map(Integer::parseInt).reduce(0, Integer::sum);
//        res = Flow.of(stringList.subList(3, 5)).map(Integer::parseInt).reduce(0, Integer::sum);
        System.out.println(res);


        System.out.println("6.3.4");
        List<Integer> integerList2 = List.of(123, -2, 5, -7, -123);
        List<List<Integer>> intlistlist = collect(integerList2,
                () -> {
                    List<ArrayList<Integer>> arrayLists = new ArrayList<>();
                    arrayLists.add(new ArrayList<Integer>());
                    arrayLists.add(new ArrayList<Integer>());
                    return new ArrayList<List<Integer>> (arrayLists);
                },
                (lists, x) -> {
//                    x<0 ? lists.get(0).add(x) : lists.get(1).add(x);
                    List<Integer> listPositive = lists.get(0);
                    List<Integer> listNegative = lists.get(1);
                    if(x<0){
                        listNegative.add(x);
                    } else listPositive.add(x);
                });
        System.out.println(intlistlist);

    }


    public static <T, R> List<R> map(List<T> lst, Function<T, R> fun){
        if (lst == null || lst.isEmpty()) return List.of();
        List<R> res = new ArrayList<>();
        for (T t: lst){
            res.add(fun.apply(t));
        }
        return res;
    }

    public static <T> List<T> filter(List<T> lst, Predicate<T> fun){
        if (lst == null || lst.isEmpty()) return List.of();
        List<T> res = new ArrayList<>();
        for (T t: lst){
            if(fun.test(t)) res.add(t);
        }
        return res;
    }

    public static <T> T reduce(T init, List<T> lst, BiFunction<T, T, T> fun){
        if (lst == null || lst.isEmpty()) return init;
        for(T t : lst){
            init=fun.apply(init, t);
        }
        return init;
    }

    public static <T> Storage reduce(List<T> lst, BiFunction<T, T, T> fun){
        if (lst.isEmpty()) return Storage.empty;
        T res = lst.getFirst();
        for(int i=1; i<lst.size(); i++){
            res=fun.apply(res, lst.get(i));
        }
        return Storage.ofNullable(res);
    }

    public static <T, P>  P collect(List<T> lst, Supplier<P> creator, BiConsumer<P, T> adder){
        P res = creator.get();
        if (lst == null || lst.isEmpty()) return res;
        for(T elem: lst){
            adder.accept(res, elem);
        }
        return res;
    }
}
