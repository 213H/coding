// test 13
// String 字符串
import java.util.Scanner;
public class str{
    public static void main(String[] args){
        
        String str1 = "Hello World";
        String str2 = "Hello World!";
        String str3 = " Hello World ";
        
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.indexOf("H"));
        System.out.println(str1.replace("H", "Y"));
        System.out.println(str1.toLowerCase());
        System.out.println(str3.trim());

        StringBuffer strb = new StringBuffer(str1);
        strb.append("!!!");
        System.out.println(strb);
        strb.reverse();
        System.out.println(strb);
    }
}