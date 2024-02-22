package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class oo1 {
    public static void main(String[] args) {
        int[] ints = {123,563,26783,2463,17,8,187};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        String[] names = {"montreal","quebec","toronto","edmonton","calgary"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
