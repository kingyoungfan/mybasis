package arraylist;

import java.util.ArrayList;

/**
 * 拷贝ArrayList 到数组.
 * Created by yangyang on 16/1/20.
 */
public class ArrayListArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        System.out.println("Actual arrayList :" + al);
        String[] strArr = new String[al.size()];
        al.toArray(strArr);
        System.out.println("Created Array content");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
