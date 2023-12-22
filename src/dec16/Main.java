package dec16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1:");
        int num1= sc.nextInt();
        System.out.println("enter number 2:");
        int num2= sc.nextInt();
        int div=0;
        try{
            div=num1/num2;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

       System.out.println(div);

    }
}
