package nov25;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int[] arr={10,20,30,40,50,60,70,80};
        int[] arr=new int[5];
        //int i=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array value:");
            arr[i]=sc.nextInt();
            //System.out.println(arr[i]);
        }
        System.out.println("original array");
        for (int element:arr) {
            System.out.print("  " +element);

        }
        int[] arr1=new int[arr.length];
        int j= arr.length;
        for (int i=0;i<arr.length;i++){
            arr1[j-1]=arr[i];
            j=j-1;
        }
        System.out.println(" ");
        System.out.println("reversed array");
        for (int element:arr1
             ) {
            System.out.print(" "+element);

        }






//        for(int i=7;i< arr.length;i--){
//
//            System.out.println(arr[i]);
//
//        }
//        while()
    }
}
