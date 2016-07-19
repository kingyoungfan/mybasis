package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序
 * Created by yangyang on 16/1/20.
 */
public class ArrayListSort {
    public static void main(String[] args) {
        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram", 3000));
        list.add(new Empl("John", 6000));
        list.add(new Empl("Crish", 2000));
        list.add(new Empl("Crish", 2400));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for (Empl e : list) {
            System.out.println(e);
        }
    }
}

class MySalaryComp implements Comparator<Empl> {
    @Override
    public int compare(Empl o1, Empl o2) {
        if (o1.getSalary() < o2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Empl {
    private String name;
    private int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Name:" + this.name + "--Salary:" + this.salary;
    }

}