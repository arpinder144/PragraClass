package nov11;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("1. Press 1 for addition");
        System.out.println("1. Press 2 for subtraction");
        System.out.println("1. Press 3 for multiplication");
        System.out.println("1. Press 4 for division");
        System.out.println("1. Press 5 for modulus");
        //System.out.println("invalid input");
        System.out.println("enter any number");
        int num= sc.nextInt();
        if(num==1){
            System.out.println("enter num1:");
            double a= sc.nextInt();
            System.out.println("enter num2:");
            double b= sc.nextInt();
            double sum=a+b;
            System.out.println("Sum="+sum);
        }
        else if(num==2){
            System.out.println("enter num1:");
            double a= sc.nextInt();
            System.out.println("enter num2:");
            double b= sc.nextInt();
            double sub=b-a;
            System.out.println("Sub="+sub);

        }
        else if(num==3){
            System.out.println("enter num1:");
            double a= sc.nextInt();
            System.out.println("enter num2:");
            double b= sc.nextInt();
            double mul=a*b;
            System.out.println("Multiply="+mul);
        }
        else if(num==4){
            System.out.println("enter num1:");
            double a= sc.nextInt();
            System.out.println("enter num2:");
            double b= sc.nextInt();
            double div=b/a;
            System.out.println("Divide="+div);
        }
        else if(num==5){
            System.out.println("enter num1:");
            double a= sc.nextInt();
            System.out.println("enter num2:");
            double b= sc.nextInt();
            double mod=b%a;
            System.out.println("Sub="+mod);
        }
        else{
            System.out.println("invalid value");
        }

    }
}
