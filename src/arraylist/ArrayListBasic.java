package arraylist;

import java.util.ArrayList;

/**
 * arrayList中的元素是有序的,允许重复 非同步的
 * Created by yangyang on 16/1/20.
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("JAVA");
        al.add("C++");
        al.add("PEAL");
        al.add("PHP");
        System.out.println(al);
        System.out.println("Element at index 1:" + al.get(1));
        System.out.println("Does list contains PYTHON:" + al.contains("PYTHON"));
        al.add(2, "PLAY");
        System.out.println(al);
        System.out.println("Is arrayList empty?" + al.isEmpty());
        System.out.println("Index PERl is: " + al.indexOf("PERL"));// 不存在元素,返回-1
        System.out.println("Size of the arrayList is: " + al.size());
    }

}
