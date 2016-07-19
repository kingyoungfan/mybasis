package arraylist;

import java.util.ArrayList;

/**
 * idea快捷键:psvm可以生成main方法
 * sout可以生成格式化打印
 * Created by yangyang on 16/1/20.
 */
public class ArrayListClear {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        System.out.println("Actual arrayList:" + al);
        al.clear();
        System.out.println("After clear arrayList" + al);
    }
}
