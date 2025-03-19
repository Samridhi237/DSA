package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class finalNotes1 {

    public static void main(String[] args) {

        //find even
        List<Integer> list= Arrays.asList(1,5,9,2,10,4,45);
           List<Integer> result1= list.stream().filter(a->a%2==0).toList();
           System.out.println(result1);

           //convert to upper case
        List<String> list2=Arrays.asList("Sam","Pam","sunita","lalita");
        List<String> result2=list2.stream().map(s->s.toUpperCase()).toList();
        System.out.println(result2);

        //first element in a list
        List<Integer> list3=Arrays.asList(2,6,9,4,1,0,8);
        Optional<Integer> result3=list3.stream().findFirst();
        System.out.println(result3.get());

        //print words that starts with S
        List<String> list4=Arrays.asList("Sam","Sunita","arti","sarthak","lila");
        List<String> result4=list4.stream().map(a->a.toUpperCase()).
                filter(a->a.startsWith("S")).toList();
        System.out.println(result4);

        //print max integer from list
        List<Integer> list5=Arrays.asList(23,8,98,34,75,13,90);
        Optional<Integer> result5=list5.stream().max((a, b) -> a.compareTo(b));
        System.out.println(result5.get());

        //print min integer from list
        List<Integer> list6=Arrays.asList(34,7,89,45,76,12);
        Optional<Integer> result6=list6.stream().min((a,b) -> a.compareTo(b));
        System.out.println(result6.get());

        //remove duplicates
        List<Integer> list7=Arrays.asList(23,78,45,6,7,89,90,23,45,67,48,90);
        List<Integer> result7 = list7.stream().distinct().toList();
        System.out.println(result7);

        //second highest number
        List<Integer> list8=Arrays.asList(23,78,45,6,7,89,90,23,45,67,48,90);
        List<Integer> result8=list8.stream().sorted((a,b) -> b-a).distinct().toList();
        System.out.println(result8.get(1));

        //group strings by their first letter
        List<String>  list9= Arrays.asList("men","women","tira","red","mina","tap","top");
        Map<Character,List<String>> result9=list9.stream().sorted()
                .map(a->a.toUpperCase()).collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(result9);
        result9.forEach( (a,b) -> System.out.println(a+" : "+b));

        //sum of digits in a list
        List<Integer> list10=Arrays.asList(23,78,45,6,7,89,90,23,45,67,48,90);
        int sumOfDigit=0;
        for(int num:list10)
        {
            while(num>0){
                sumOfDigit=sumOfDigit+num%10;
                num=num/10;
            }
        }
        System.out.println(sumOfDigit);

        //using stream calculate sum of digit
        List<Integer> list11=Arrays.asList(23,78,45,6,7,89,90,23,45,67,48,90);
        int sum=list11.stream().mapToInt(a->String.valueOf(a).chars()
                .map(c->Character.getNumericValue(c)).sum()).sum();

    }
}


