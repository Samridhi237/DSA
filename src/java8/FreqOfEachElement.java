package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachElement {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pen","Pencil","Table","Chair","Pen","Table");
        Map<String,Long> result=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

}}


