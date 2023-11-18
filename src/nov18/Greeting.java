package nov18;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String firstName=sc.nextLine();
        System.out.println("enter last name");
        String lastName= sc.nextLine();
        System.out.println("enter language");
        String language= sc.nextLine();
        greet(firstName,lastName,language);
        //System.out.println(greet(firstName, language));


    }
//    public static String greet(String name,String language){
//        String lastname="singh";
//        return greet(name,lastName,language);
//  }
    public static void greet(String firstName,String lastName,String language){
        switch (language){
            case "english":
                System.out.println(firstName + "  " + lastName +"   " +"Hello");
                break;
            case "hindi":
                System.out.println(firstName + "  " + lastName + "  "+"namaste");
                break;
            case "punjabi":
                System.out.println(firstName + "  " + lastName + "  "+"sat shri akal");
                break;
            case "spanish":
                System.out.println(firstName + "  " + lastName +"  "+ "hola");
                break;
            case "french":
                System.out.println(firstName + "  " + lastName + "  " +"bonjour");
                break;

        }

    }
}
