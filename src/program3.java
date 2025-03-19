//Multiply the elements in array using java8

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class program3 {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        List<Integer> list= Arrays.asList(arr);
        Optional<Integer> output=list.stream().reduce((a,b)->a*b);
        if(!output.isEmpty())
            System.out.println("Multiplied array :"+output.get());
        else
            System.out.println("Array is empty");

//        Integer sum=1;
//        for(Integer num: list) {
//            sum = sum * num;
//        }
//        System.out.println(sum);
        }

    }

