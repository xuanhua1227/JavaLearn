package 常见类.system;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //arraycopy()数组赋值

        //src:原数组,secPos:从哪个位置开始复制，dest：目标数组，destPos：目标数组的位置，length：复制的长度
        //创建数组
        int[] arr = {20,10,12,45,6,78,9,12,23,45,43};
        int[] dest = new int[15];
        try {
            System.arraycopy(arr,0,dest,0,arr.length);
            for (int i : dest) {
                System.out.println(i);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("不匹配");
        }

    }
}
