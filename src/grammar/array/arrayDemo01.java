package grammar.array;

public class arrayDemo01 {
    public static void main(String[] args) {
        //变量类型   变量名字  = 变量的值
        int[] nums;//首选
        int nums2[];//效果相同，但非首选（C，C++中使用）,知道即可

        nums = new int[10];//这个数组中可以存放10个int类型的数字。

        System.out.println(nums[9]);
        System.out.println(nums.length);
    }
}
