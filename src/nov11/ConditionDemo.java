package nov11;

import java.util.Scanner;

public class ConditionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x:");
        int x= sc.nextInt();
        System.out.println("enter y:");
        int y= sc.nextInt();
        System.out.println("enter z:");
        int z= sc.nextInt();
        if (x>y && x>z){
            System.out.println("x is greater:"+x);
        }
        else if(y>x && y>z){
            System.out.println("y is greater:"+y);
        }
        else {
            System.out.println("zis greater:"+z);
        }
    }
}
