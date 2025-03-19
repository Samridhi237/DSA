package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,67,98,34,70,37,12,5,90,12,87,67);
        List<Integer> result=list.stream().distinct().toList();
        System.out.println(result);

    }
}
