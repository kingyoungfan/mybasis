package fundamental;

import java.util.Arrays;

/**
 * 数组排序
 * Created by yangyang on 16/1/21.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] myArr = {3,2,56,12,98,23,56};
        Arrays.sort(myArr);
        for(int i: myArr){
            System.out.println(i);
        }
    }

}
