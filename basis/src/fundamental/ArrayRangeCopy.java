package fundamental;

import java.util.Arrays;

/** copy range of elements from an array
 * Created by yangyang on 16/1/21.
 */
public class ArrayRangeCopy {
    public static void main(String[] args) {
        int[] ints = {23, 345, 16, 4, 3, 0, 234};
        System.out.println("My array element:\n");
        for(int num: ints){
            System.out.println(num);
        }
        int[] newArr = Arrays.copyOfRange(ints, 2, 4);
        System.out.println("\nMy new array element: \n");
        for(int num: newArr){
            System.out.println(num);
        }
    }
}
