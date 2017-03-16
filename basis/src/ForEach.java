import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**zz
 * ForEach
 *
 * @author yangyang
 * @create 16/7/29 09:59
 * @function
 */
public class ForEach {

    public static void main(String[] args) {
        System.out.println();
        genList();
    }

    private static List<Map<Object, Object>> genList() {
        List<Map<Object, Object>> ret = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<Object, Object> map = new HashMap<>();
            map.put("id", i);
            map.put("name", "yangyang"+i);
            System.out.println(map);

            ret.add(map);
            System.out.println(ret);
        }
        return ret;
    }
}
