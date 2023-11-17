package nov14;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value");
        int input=sc.nextInt();
        System.out.println("Enter end value");
        int end= sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(;input<end;input++){
            System.out.print("given value  :"+input);
            if(input%2==0){
                System.out.println("        "+"even number :"+input);
                sumEven+=input;
            }else {
                System.out.println("        "+"odd number  :"+input);
                sumOdd+=input;
            }

        }
        System.out.println("sum of even numbers:"+sumEven);
        System.out.println("sum of Odd numbers:"+sumOdd);
    }
}
