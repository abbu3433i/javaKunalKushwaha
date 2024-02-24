import java.util.Scanner;

public class a_18switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        int age = sc.nextInt();
        System.out.println(age);
        
        // **********Switch case***********
        switch (age) {
            case 15:
                System.out.println("you are kid");
                break;

                case 23:
                System.out.println("you are adult");
                break;

                case 60:
                System.out.println("you are retire now");
                break; 

            default:
            System.out.println("you are not a human");
                break;
        }
       
        // *********Normal case**********
        /*
        if(age>55){
            System.out.println("This is the class");
        }
        else if(age==20){
            System.out.println("This is the semi-semi class");
        }
        else if(age<=33){
         System.out.println("This is the semi-class");
        }
        else{
            System.out.println("Not any class");
        }
        */

        

    }
}