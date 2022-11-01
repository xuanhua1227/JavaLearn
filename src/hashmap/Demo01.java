package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Student, String> students = new HashMap<>();
        Student student = new Student("猪八戒", 101);
        Student student1 = new Student("沙和尚", 102);
        students.put(student,"高老庄");
        students.put(student1,"流沙河");
        System.out.println(students.toString());
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            System.out.println(entry.getKey()+"========="+entry.getValue());
        }
    }
}
