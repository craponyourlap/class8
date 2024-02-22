package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class oo6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("enter 10 integers:");
        int newN;
        for (int i = 0; i < 10; i++){
            newN = in.nextInt();
            if (arr.contains(newN))continue;//skips if the arraylist already contains entered integer
            arr.add(newN);
        }
        Collections.sort(arr);
        System.out.println("sorted list of unique integers, ascending:" + arr);

    }
}
