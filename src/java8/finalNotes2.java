package java8;

import java.sql.SQLData;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class finalNotes2 {
    public static void main(String[] args) {

        List<employee1> emp = Arrays.asList(
                new employee1(1, "Alice", "HR", 7000, 34),
                new employee1(2, "Bob", "IT", 3500, 98),
                new employee1(3, "Cob", "Finance", 4500, 36),
                new employee1(4, "Tina", "IT", 3000, 24));

        //salary greater than 4000
        List<employee1> result1 = emp.stream().filter(a -> a.getSalary() > 4000).toList();
        System.out.println("Salary greater than 4000: " + result1);

        //print only names
        List<String> printName = emp.stream().map(a -> a.getName()).toList();
        System.out.println(printName);

        //employee with highest salary
        Optional<employee1> result3 = emp.stream().max((a, b) -> Double.compare(a.getSalary(), b.getSalary()));
        System.out.println(result3.get());

        //count employees in each deppt
        Map<String, Long> result4 = emp.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
        result4.forEach((key, map) -> System.out.println(key + " : " + map));

        //avg salary
        Optional<Double> result5 = Optional.of(emp.stream().mapToDouble(a -> a.getSalary()).average().getAsDouble());
        System.out.println(result5);

        //employees older than 30
        List<employee1> result6 = emp.stream().filter(e -> e.getAge() > 30).toList();
        System.out.println(result6);

        //second highest salary
        List<employee1> result8=emp.stream().sorted((a,b)-> (b.getSalary() - a.getSalary())).toList();
        System.out.println(result8.get(1));

        //group employees by age range
        Map<Object,List<employee1>> result9=emp.stream().collect(Collectors.groupingBy(e-> {
                    if (e.getAge() < 30) return "Young";
                    else if (e.getAge() <= 40) return "Mid-Age";
                    else return "Senior";
                }));
        System.out.println(result9);

        //sum of salary of emp of IT deptt
        double salary= emp.stream().filter(a-> a.getDept().equalsIgnoreCase("it")).mapToDouble(a->a.getSalary()).sum();
        System.out.println(salary);

        Stack l= new Stack();
        l.push("A");
        l.push("B");
        l.push("C");
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println(l);

    }
}