package fundamental;

import java.util.Arrays;

/**
 * fill an array with default values
 * 装满一个数组Arrays.fill();
 * Created by yangyang on 16/1/21.
 */
public class ArrayFill {
    public static void main(String[] args) {
        String[] strArr = new String[10];
        Arrays.fill(strArr, "Assigned");
        for(String str: strArr){
            System.out.println(str);
        }
    }
}
