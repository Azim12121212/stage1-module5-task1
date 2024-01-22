package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return x -> {
            int c = 0;

            for (String s: x) {
                if (Character.isUpperCase(s.charAt(0))) {
                    c++;
                }
            }

            if (c==x.size()) {
                return true;
            }

            return false;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return x -> {
            List<Integer> list = new ArrayList<>();

            for (Integer i: x) {
                if (i%2==0) {
                    list.add(i);
                }
            }

            System.out.println(x.addAll(list));
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return () -> {
            List<String> result = new ArrayList<>();

            for (String s: values) {
                String[] arr = s.split(" ");
                if (Character.isUpperCase(s.charAt(0)) && arr.length>3 && s.endsWith(".")) {
                    result.add(s);
                }
            }

            return result;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return x -> {
            Map<String, Integer> map = new HashMap<>();

            for (String s: x) {
                map.put(s, s.length());
            }

            return map;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        //throw new UnsupportedOperationException("You should implement this method.");
        return (list1, list2) -> {
            List<Integer> resList = new ArrayList<>(list1);
            resList.addAll(list2);
            return resList;
        };
    }
    public static void main(String[] args) {
        InterfaceCreator interfaceCreator = new InterfaceCreator();

        List<String> list = new ArrayList<>();
        list.add("String");
        list.add("akaka");
        List<Integer> list2 = new ArrayList<>();
        list2.add(48);
        list2.add(13);
        list2.add(100);
        list2.add(5);
        list2.add(222);
        list2.add(3);
        List<String> list3 = new ArrayList<>();
        list3.add("This is a good way to learn Java Functional Interfaces.");
        list3.add("This is a good weather");
        list3.add("Hello world in Java.");
        List<Integer> list4 = new ArrayList<>();
        list4.add(48);
        list4.add(56);
        list4.add(100);
        list4.add(200);
        list4.add(222);

        //System.out.println(interfaceCreator.concatList().apply(list2, list4));
        interfaceCreator.addEvenValuesAtTheEnd().accept(list4);
    }
}
