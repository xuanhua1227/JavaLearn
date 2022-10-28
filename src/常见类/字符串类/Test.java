package 常见类.字符串类;

public class Test {
    public static void main(String[] args) {
        String str = "this is a text";
        //1、将str中的单词单独获取出来
        String[] s = str.split(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }
        //2、将str中的txt替换为practice
        System.out.println("===================");
        String s1 = str.replace("text", "practice");
        System.out.println(s1);
        //3、在text前插入easy
        System.out.println("===================");
        String s2 = str.replace("text", "easy text");
        System.out.println(s2);
        //4、将每个首字母大写(upper不能用)
        for (String s3 : s) {
            char c = s3.charAt(0);
            //把第一个字符转成大写
            char c1 = Character.toUpperCase(c);
            //substring()字符串截取
            String news = c1 + s3.substring(1);
            System.out.println(news);
        }
    }
}
