package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间工具
 * Created by yangyang on 16/1/22.
 */
public class Dates {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        String today = df.format(new Date());
        System.out.println(today);

    }
}

class BasicDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println("---------");
        System.out.println("-------year is "+date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
    }
}
class MyCalendar{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }

}