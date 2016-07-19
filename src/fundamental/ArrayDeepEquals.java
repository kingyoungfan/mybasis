package fundamental;

import java.util.Arrays;

/**
 * compare two arrays and confirm they are equal
 * Created by yangyang on 16/1/21.
 */
public class ArrayDeepEquals {
    public static void main(String[] args) {
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        String[] strArrMod = {"JAVA", "C++", "PERL", "STRUTS"};
        System.out.println("Are strArr and strArrCopy same?:"+ Arrays.deepEquals(strArr, strArrCopy));
        System.out.println("Are strArr and strArrMod same?"+Arrays.deepEquals(strArr, strArrMod));

    }
}
