import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.stream.Collectors.counting;
//print occurance of each integer.

public class program1 {
    public static void main(String[] args) {
       List<Integer> numlist= Arrays.asList(1, 5, 3, 4, 8, 1, 2, 9, 8, 5, 4, 6, 7);
       List<String> names=Arrays.asList("Hema", "Rekha","Jaya","Sushma","Geeta","Hema");
        Map<Integer, Long> result1 = numlist
                                    .stream()
                                    .collect(Collectors.groupingBy(Function.identity(), counting()));
        Map<String, Long>  result2 = names
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        result1.forEach((key, value) ->
                System.out.print(key + ":" + value+ " "));
        result2.forEach((key, value) ->
                System.out.print(key + ":" + value+ " "));
    }




    }

