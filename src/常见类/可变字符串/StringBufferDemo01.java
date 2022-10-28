package 常见类.可变字符串;

/**
 * StringBuffer和StringBuilder的使用
 * 和String区别：1、效率比String高
 *              2、比String节省内存
 *
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //1 append()追加
        sb.append("java is the best");
        System.out.println(sb.toString());
        sb.append(" java good");
        System.out.println(sb.toString());
        //2 insert()添加
        sb.insert(0,"php ");
        System.out.println(sb.toString());
        //3 replace()
        sb.replace(0,10,"php is the best");
        System.out.println(sb.toString());
        //4 delete()删除
        sb.delete(0,10);
        System.out.println(sb.toString());
        //5 reverse()反转
        sb.reverse();
        System.out.println(sb.toString());

    }
}
