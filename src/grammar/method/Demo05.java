package grammar.method;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //模拟计算器
        Scanner scanner = new Scanner(System.in);
        double result;
        double i = scanner.nextDouble();
        result = i;
        while (true){
            String s = scanner.next();
            if (s.equals("n")){
                break;
            }
            double j = scanner.nextDouble();
            switch (s){
                case "+":result = add(result,j);
                    System.out.println(result);
                    break;
                case "-":result = reduce(result,j);
                    System.out.println(result);
                    break;
                case "*":result = ride(result,j);
                    System.out.println(result);
                    break;
                case "/":result = except(result,j);
                    System.out.println(result);
                    break;
            }}
    }
    public static double add(double i ,double j ){
        return i+j;
    }
    public static double reduce(double i ,double j ){
        return i-j;
    }
    public static double ride(double i ,double j ){
        return i*j;
    }
    public static double except(double i ,double j ){
        return i/j;
    }
}
