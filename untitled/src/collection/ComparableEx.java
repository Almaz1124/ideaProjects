package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Eva");
        list.add("Jone");
        list.add("Alice");

        //System.out.println(list);
        //Collections.sort(list);
        //System.out.println(list);

        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(100, "Sasha", "Ivanov", 60000);
        Employee emp2 = new Employee(15, "Anna", "Gorshkova", 40000);
        Employee emp3 = new Employee(103, "Anna", "Aleksandrova", 55000);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println("Before sorting \n" + list1);
        Collections.sort(list1);//нужно задать критерии сортировки объектов
        System.out.println("After sorting \n" + list1);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return this.id - o.id;//в основном используют этот вариант
        //return this.id.compareTo(o.id);//этот вариант возможен если переменная задана по классу обертки - Integer
//        if(this.id == o.id)//это самый натуральный вариант
//            return 0;
//        else if (this.id < o.id)
//            return -1;
//        else
//            return 1;
        int res = this.id - o.id;
        if(res == 0)
            res = this.name.compareTo(o.name);

        return res;
    }
}
