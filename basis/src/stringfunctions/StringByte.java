package stringfunctions;

import java.util.Arrays;

/**
 *byte类型-128-127之间的整数
 * Created by yangyang on 16/1/21.
 */
public class StringByte {
    public static void main(String[] args) {
        String s = "core java api";
        byte[] b = s.getBytes();
        System.out.println(s);
        System.out.println(Arrays.toString(b));
    }
}
