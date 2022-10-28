package 常见类.Demo01;

public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student("aaa",20);
        Student s2 = new Student("bbb",22);
        //getClass()
        Class<? extends Student> s1Class = s1.getClass();
        Class<? extends Student> s2Class = s2.getClass();
        if (s1Class==s2Class){
            System.out.println("相同");
        }else {
            System.out.println("不同");
        }
        //hashcode()
        System.out.println("==========hashcode()===========");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student s3 = s1;
        System.out.println(s3.hashCode());
        System.out.println("==========toString()===========");
        //toString()
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("===========equals()============");
        //equals() 比较两个地址
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Student a = new Student("a", 1);
        Student a1 = new Student("a", 1);
        System.out.println(a.equals(a1));
    }


}
