package nov11;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select option 1 for English ");
        System.out.println("Select option 2 for French");
        System.out.println("Select a language");
        int language= sc.nextInt();
        if(language==1){
            // System.out.println("English Selected");
            System.out.println("Select a option");
            System.out.println("1. Press 1 for Home internet");
            System.out.println("2. Press 2 for Mobility services");
            System.out.println("3. Press 3 for new users");
            System.out.println("4. Press 4 for payment ");
            System.out.println("5 Press 5 for repeat options");
            int select= sc.nextInt();
            while(select>0){

            switch(select){
                case 1:
                    System.out.println("Home internet");
                    select=-1;
                    break;
                case 2:
                    System.out.println("Mobility services");
                    select=-1;
                    break;
                case 3:
                    System.out.println("New users");
                    select=-1;
                    break;
                case 4:
                    System.out.println("payment");
                    select=-1;
                    break;
                case 5:
                    System.out.println("repeat Options");
                    select=6;
                    break;
                default :
                    System.out.println("exit from menu");
                    select=-1;
                    break;

            }}
        }else{
            System.out.println("French options");
        }
    }
}
