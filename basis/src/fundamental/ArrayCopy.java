package fundamental;

import java.util.Arrays;

/**
 * Created by yangyang on 16/1/21.
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] intArr = {23, 1, 4, 12, 899, 25, 15};
        System.out.println("Array size before copy :" + intArr.length);
        System.out.println("Array:" + Arrays.toString(intArr));
        int[] newIntArr = Arrays.copyOf(intArr, 10);
        System.out.println("New array size after coping :" + newIntArr.length);
        System.out.println("New array:" + Arrays.toString(newIntArr));
    }
}
