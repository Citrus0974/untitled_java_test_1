package edu.khityaev.main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Start8_0_Streams {
    public static void main(String[] args) {
        List<String> stringList = List.of("123", "-34", "4567", "5678", "98");
        List<String> stringList2 = List.of("asd", "Awer", "dsf", "sdf", "af", "12");

        int num = stringList2.stream()
                .filter(str -> str.length()<3)
                .filter(x -> x.matches("\\d+"))
                .map(Integer::parseInt)
                .filter(x -> x>10 && x<100)
                .reduce(0, (x, y) -> x+y);
        System.out.println(num);


        String string = stringList2.stream()
                .filter(str -> str.startsWith("a") || str.startsWith("A"))
                .map(str -> "A" + str.substring(1))
                .reduce("", (x, y) -> x+y);
        System.out.println(string);


        List<String> stringList3 = List.of("asd", "asd","asd","asd","asd","Awer", "dsf", "sdf", "sdf", "af", "12");
        int c = (int) stringList3.stream().distinct().count();
        System.out.println(c);
        c = (int) stringList3.stream()
                .flatMapToInt(String::chars)
                .distinct()
                .count();
        System.out.println(c);

        Map<String, Integer> map2 = stringList3.stream()
                .flatMapToInt(String::chars)
                .boxed()
                .collect(HashMap::new, (map, x) -> {
                    String chr = String.valueOf((char)(int)x);
                   if(map.get(chr)==null){
                       map.put(chr, 1);
                   } else {
                       map.put(chr, map.get(chr)+1);
                   }
                }, (map, nw) -> {});
        System.out.println(map2);
                //надо починить - посчитать количество каждой буквы


        //список строк; разбить строки по пробелам
        //пустые строки убрать лишние пробелы убрать
        // и для каждой подстроки выполнить её нормализацию (все буквы маленькие первая большая)
        //получить итоговые строки отсортированные в списки по первой букве
        List<String> strList2 = List.of("kto test", "", "azaza", " ","qwer tyui", "tyu", "kEnT");
        Map<String, List<String>> sortedStrings = strList2.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .filter(str -> !str.isEmpty() && !str.equals(" "))
                .map(String::toLowerCase)
                .map(str -> {
                    String sub = str.substring(0, 1);
                    String end = str.substring(1);
                    sub = sub.toUpperCase();
                    return sub+end;
                })
                .collect(HashMap::new, (stringListHashMap, s) -> {
                    String sub = s.substring(0, 1);
                    if(stringListHashMap.get(sub)==null){
                        List<String> currStart = new ArrayList<>();
                        currStart.add(s);
                        stringListHashMap.put(sub, currStart);
                    } else {
                        stringListHashMap.get(sub).add(s);
                    }
                }, (map, map3) -> {});
        System.out.println(sortedStrings);



    }




}
