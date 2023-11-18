package nov18;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i <=5 ; i++) {
            System.out.println("enter value");
            int j= sc.nextInt();
            if(j%5==0){
                System.out.println("multiple of 5");
                continue;
            }
            if(j%3==0){
                System.out.println("sorry you enter multiple of 3");
                break;
            }else {
                System.out.println("");
            }

        }
    }
}
