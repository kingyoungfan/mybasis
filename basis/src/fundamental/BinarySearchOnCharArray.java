package fundamental;

import java.util.Arrays;

/**
 * binarySearch(char[] a, int fromIndex, int toIndex, char key)
 * a:字符数组
 * fromIndex: 搜索开始位置
 * toIndex:搜索结束位置
 * key:目标字符
 * Created by yangyang on 16/1/21.
 */
public class BinarySearchOnCharArray {
    public static void main(String[] args) {
        char[] chrArr = {'a', 'c', 'd', 'y', 'e', 'q', 'b'};
        int index = Arrays.binarySearch(chrArr, 0, chrArr.length - 1, 'q');
        System.out.println("Char 'q' index is  :" + index);
        char c = '楊';
        System.out.println(c);
    }
}
