package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * list转换为string
 * 双大括号法初始化list
 * Created by yangyang on 16/1/20.
 */
public class ArrayListToCsvString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){
            {
                add("animal");
                add("nuts");
                add("java");
            }
        };
        ArrayListToCsvString ts = new ArrayListToCsvString();
        System.out.println(ts.getListAsCsvString(list));
    }

    public String getListAsCsvString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s :
                list) {
            if (sb.length() != 0){
                sb.append(",");
            }
            sb.append(s);
        }
        return sb.toString();
    }
}
