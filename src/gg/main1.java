package gg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        String[] stringss = {"apple","orange","banana"};
        List<String> strings = new ArrayList<>(Arrays.asList(stringss));
        System.out.println(strings.size());
        List<Double> doubles = new ArrayList<>();
        strings.set(1,"cherry");
        System.out.println(strings.size());
        strings.remove("apple");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
        for (int i = 0; i < 200; i++) {
            doubles.add(Math.random());
        }
        Collections.sort(doubles,(o1, o2) -> Double.compare(o2,o1));
        System.out.println(doubles);
        for (int i = 0; i < 200; i++){
            doubles.set(i,Math.random());
        }
        Collections.sort(doubles,(o1, o2) -> Double.compare(o1,o2));
        System.out.println(doubles);
    }
}
