import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program4 {
    public static void main(String[] args) {
        List<Employee1> list = createList();
        //print employee with age above 25
        List<Employee1> result=list.stream().filter(x->x.getAge()>25).collect(Collectors.toList());
        result.forEach(x-> System.out.println("age above 25: "+x));

//        //print employee with age between 20 and 25
        List<Employee1> result1=list.stream().filter(emp->emp.getAge()<25&&emp.getAge()>20).toList();
        result1.forEach(emp-> System.out.println("age between 20 and 25: "+emp));

        //print only name of employee with age between 20 and 25
        List<String> names=list.stream().filter(emp->emp.getAge()<25&&emp.getAge()>20)
                            .map(emp->emp.getName()).toList();
        names.forEach(emp-> System.out.println("name of employee with age between 20 and 25: "+emp));
    }

    private static List<Employee1> createList() {
        List<Employee1> emp = new ArrayList<>();
        Employee1 e1 = new Employee1("Ram", "Pune", 12234, 26);
        Employee1 e2 = new Employee1("Pam", "Goa", 12346, 33);
        Employee1 e3 = new Employee1("Kim", "Delhi", 23412, 27);
        Employee1 e4 = new Employee1("Lucky", "Beena", 43289, 24);
        Employee1 e5 = new Employee1("Mohan", "Guna", 93254, 30);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        return emp;
    }

}