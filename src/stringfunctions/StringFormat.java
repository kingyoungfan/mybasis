package stringfunctions;

/**
 * StringFormat
 *
 * @author yangyang
 * @create 16/7/19 17:09
 * @function
 */
public class StringFormat {
    public static void main(String[] args) {
        String content = "【付啦收款宝】您的朋友'#username#'已注册为会员,您可以在我的团队里查看。";
        String mobile = "15857162155";
        String format = content.replaceAll("#(.*?)#", mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));
        System.out.println(format);
    }

}
