package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max3Min3 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> max3=listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        List<Integer> min3=listOfIntegers.stream().sorted().limit(3).toList();
        System.out.println("Max: "+max3+" Min: "+ min3);
    }
}
