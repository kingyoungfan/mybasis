package fundamental;

import java.util.Arrays;
import java.util.List;

/**
 * convert arrays to list
 * Created by yangyang on 16/1/21.
 */
public class ArraysToList {
    public static void main(String[] args) {
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println(strList);
    }
}
