package stringfunctions;

import org.apache.commons.lang.StringUtils;

/**
 * StringBlankAndEmpty
 *
 * @author yangyang
 * @create 16/7/20 17:00
 * @function
 */
public class StringBlankAndEmpty {
    public static void main(String[] args) {
        /*
         * empty:字符串是否为null或者长度为0
         */
        System.out.println(StringUtils.isEmpty(null));//true
        System.out.println(StringUtils.isEmpty("")); //true
        System.out.println(StringUtils.isEmpty(" ")); //false
        System.out.println(StringUtils.isEmpty("foo")); //false
        System.out.println("空白符 is empty:" + StringUtils.isEmpty("\t\n\f\r")); //false
        System.out.println("单词边界符:" + "\b");
        System.out.println("==============\n");
        /*
         * blank: 字符串是否为null或者长度为0或者由空白字符(whitespace)构成
         */

        System.out.println(StringUtils.isBlank(null)); // true
        System.out.println(StringUtils.isBlank("")); //true
        System.out.println(StringUtils.isBlank(" "));//true
        System.out.println(StringUtils.isBlank("\t\n\f\r"));//true:制表符、换行符、换页符、回车符
        System.out.println(StringUtils.isBlank("\b"));//false:单词边界符不是whitespace
        System.out.println(StringUtils.isBlank("foo"));//false
    }
}
