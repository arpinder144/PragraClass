package nov11;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select option 1 for English");
        System.out.println("Select option 2 for French");
        System.out.println("Select language");
        int language= sc.nextInt();
        switch (language){
            case 1:{
                while(language>0){
                System.out.println("Press 1 for mobile");
                System.out.println("Press 2 for internet");
                System.out.println("Press 3 for Tv");
                System.out.println("Press 4 for customer support");
                System.out.println("Press 5 for return to previous menu");
                int num= sc.nextInt();
                if (num == 1){
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech support");
                    System.out.println("Press 3 for cancellation");
                    int num1= sc.nextInt();
                    if(num1==1){
                        System.out.println("Billing");
                        language=-1;
                    }
                    else if(num1==2){
                        System.out.println("Tech support");
                        language=-1;
                    }
                    else if ( num1==3 ){
                        System.out.println("Cancellation");
                        language=-1;
                    }else{
                        System.out.println("Wrong selection");
                        language=-1;
                    }
                }
                else if(num==2){
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech support");
                    System.out.println("Press 3 for cancellation");
                    int num1= sc.nextInt();
                    if(num1==1){
                        System.out.println("Billing");
                        language=-1;
                    }
                    else if(num1==2){
                        System.out.println("Tech support");
                        language=-1;
                    }
                    else if ( num1==3 ){
                        System.out.println("Cancellation");
                        language=-1;
                    }else{
                        System.out.println("Wrong selection");
                        language=-1;
                    }
                }else if(num==3){
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech support");
                    System.out.println("Press 3 for cancellation");
                    int num1= sc.nextInt();
                    if(num1==1){
                        System.out.println("Billing");
                        language=-1;
                    }
                    else if(num1==2){
                        System.out.println("Tech support");
                        language=-1;
                    }
                    else if ( num1==3 ){
                        System.out.println("Cancellation");
                        language=-1;
                    }else{
                        System.out.println("Wrong selection");
                        language=-1;
                    }
                }
                else if(num==4){
                    System.out.println("Press 1 for Billing");
                    System.out.println("Press 2 for Tech support");
                    System.out.println("Press 3 for cancellation");
                    int num1= sc.nextInt();
                    if(num1==1){
                        System.out.println("Billing");
                        language=-1;
                    }
                    else if(num1==2){
                        System.out.println("Tech support");
                        language=-1;
                    }
                    else if ( num1==3 ){
                        System.out.println("Cancellation");
                        language=-1;
                    }else{
                        System.out.println("Wrong selection");
                        language=-1;
                    }
                }
                else if(num==5) {
                    System.out.println("return to previous menu");
                    language=5;
                }
            }break;
            }


            case 2:{
               System.out.println("French language");
                break;
            }
        }
    }
}
