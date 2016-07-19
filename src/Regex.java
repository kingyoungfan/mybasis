import java.util.regex.*;

/**
 * java中的正则表达式
 * Created by yangyang on 16/1/15.
 */
public class Regex {
    private transient int i;
    public static void main(String[] args){
        String line = "This000 order was placed for ! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Found Value:"+ m.group(0));
            System.out.println("Found Value:"+ m.group(1));
            System.out.println("Found Value:"+ m.group(2));
        }else{
            System.out.println("not found");
        }
    }

}
