package fundamental;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用Comparator排序数组
 * Created by yangyang on 16/1/21.
 */
public class ArraySortByComparator {
    public static void main(String[] args) {
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
