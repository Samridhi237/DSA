package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqChar {
    public static void main(String[] args) {
        String test="I like programming";
        Map<Character, Long> result= test.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
