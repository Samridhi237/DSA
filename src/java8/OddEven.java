package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,56,7,8,24,90,37,98);
        Map<Boolean,List<Integer>> result=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.print("Even :"+ result.get(true)+'\n'+"Odd: "+ result.get(false));



    }

}
