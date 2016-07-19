package linkedlist;

import java.util.LinkedList;

/**
 *
 * Created by yangyang on 16/1/20.
 */
public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grape");
        list.add("Banana");
        System.out.println(list);
        System.out.println("Size of the linked list:"+ list.size());
        System.out.println("Is linkedList empty?:"+list.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'?"+ list.contains("Grape"));

    }
}
