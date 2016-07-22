import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * RandomDate
 * java 获取某个区级的随机时间
 *
 * @author yangyang
 * @create 16/7/21 19:20
 * @function
 */
public class RandomDate {
    public static void main(String[] args) {
        Date randomDate = randomDate("2016-07-21 19-40-00", "2016-07-21 21-00-00");
        System.out.println(randomDate);
    }

    private static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
            Date begin = sdf.parse(beginDate);
            Date end = sdf.parse(endDate);
            if (begin.getTime() >= end.getTime()) {
                return null;
            }
            Long trn = begin.getTime() + (long) (Math.random() *
                    (end.getTime() - begin.getTime()));
            return new Date(trn);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
