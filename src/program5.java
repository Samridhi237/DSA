//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class program5 {
//    public static void main(String[] args) {
//        List<Employee2> list=createList();
////program to print max/min employee salary
//        Optional<Employee2> maxresult=list.stream()
//                        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary)));
//        System.out.println("Max salary :"+maxresult.get());
//
//        Optional<Employee2> minResult=list.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee2::getSalary)));
//        System.out.println("Min Salary: "+minResult.get());
//
//        //program to print max salary from each deppt
//        list.stream()
//                .collect(Collectors.groupingBy(Employee2::getDepartment))
//                .forEach(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary()))));
//
//
//
//
//
//    }
//
//    private static List<Employee2> createList() {
//        List<Employee2> list=new ArrayList<>();
//        Employee2 emp1=new Employee2(12,"Ram","Yes",23000,"HR",2023,22);
//        Employee2 emp2=new Employee2(13,"Preety","No",34000,"IT",2021,32);
//        Employee2 emp3=new Employee2(14,"Naveen","Yes",78000,"HR",2019,28);
//        Employee2 emp4=new Employee2(15,"Mohan","Yes",90000,"Law",2009,20);
//        Employee2 emp5=new Employee2(16,"Raj","Yes",53000,"IT",2012,42);
//        Employee2 emp6=new Employee2(17,"Rita","No",29000,"Support",2018,34);
//        Employee2 emp7=new Employee2(18,"Samar","Yes",22000,"Support",2011,25);
//        Employee2 emp8=new Employee2(19,"Sita","No",21000,"IT",2023,26);
//        Employee2 emp9=new Employee2(20,"Pia","Yes",73000,"Support",2020,40);
//        Employee2 emp10=new Employee2(21,"Sia","Yes",55000,"HR",2013,22);
//        Employee2 emp11=new Employee2(22,"Anuj","Yes",213000,"IT",2012, 22);
//        list.add(emp1);
//        list.add(emp2);
//        list.add(emp3);
//        list.add(emp4);
//        list.add(emp5);
//        list.add(emp6);
//        list.add(emp7);
//        list.add(emp8);
//        list.add(emp9);
//        list.add(emp10);
//        list.add(emp11);
//           return list;
//    }
//}
