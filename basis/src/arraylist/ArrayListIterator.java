package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 使用迭代器循环遍历ArrayList
 * Created by yangyang on 16/1/20.
 */
public class ArrayListIterator {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
