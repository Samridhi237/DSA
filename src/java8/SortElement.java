package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,546,6787,213123,54676,2132,3453,6576,5600);
        List<Integer> result= list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result);
        List<Integer> res=list.stream().filter(x->x%5==0).toList();
        System.out.println(res);
        int max=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        int min= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

    }
}
