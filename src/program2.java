//print list of employee based on city

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program2 {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        createList(emplist);
        Map<String,List<Employee>> result= emplist
                                            .stream()
                                            .collect(Collectors.groupingBy(Employee::getCity));
        result.forEach((key,value)->
                System.out.println("City: "+key+" : "+"EmployeeList: " +value));

    }

    private static void createList(List<Employee> emplist)
    {
        String Employee;
        int id;
        String city;
        Employee e1=new Employee("Ram",20,"Varanasi");
        Employee e2=new Employee("Sita",32,"Pune");
        Employee e3=new Employee("Lucky",26,"Goa");
        Employee e4=new Employee("Mohan",12,"Pune");
        Employee e5=new Employee("Gita",21,"Delhi");
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);
        emplist.add(e5);
    }
}

