package nov18;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1= sc.nextInt();
        System.out.println("enter second number");
        int num2= sc.nextInt();
        System.out.println("Press 1: for addition");
        System.out.println("Press 2: for subtraction");
        System.out.println("Press 3: for multiplication");
        System.out.println("Press 4: for divide");
        System.out.println("Press 5: for modulus");
        int cal= sc.nextInt();
        switch (cal){
            case 1:
                int sum = sum(num1, num2);
                System.out.println("sum of two numbers"+ sum);
                break;
            case 2:
                double sub = sub(num1, num2);
                System.out.println("sum of two numbers"+ sub);
                break;
            case 3:
                double mul = mul(num1, num2);
                System.out.println("sum of two numbers"+ mul);
                break;
            case 4:
                double div = div(num1, num2);
                System.out.println("sum of two numbers"+ div);
                break;
            case 5:
                double mod = mod(num1, num2);
                System.out.println("sum of two numbers"+ mod);
                break;
            default:
                System.out.println("wrong input");

        }
    }

    public static int sum(int x,int y){
        int z=x+y;
        return z;
    }
    public static double sub(int x,int y){
        double z=y-x;
        return z;
    }
    public static double mul(int x,int y){
        double z=x*y;
        return z;
    }
    public static double div(int x,int y) {
        double z = y/x;
        return z;
    }
    public static double mod(int x,int y) {
        double z = y%x;
        return z;
    }
}
