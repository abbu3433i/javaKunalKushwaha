import java.util.Scanner;

public class a_5userinput{
    public static void main (String[] args){
        System.out.println("Taking input from user:");

       //taking user input by giving this
        Scanner sc = new Scanner(System.in);
         System.out.println(sc);  //just showing yellow line thatswhy print is created

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum of the two values is:"+sum);



        // ***********Also same as for float************
        // System.out.println("Enter the first number");
        // float a = sc.nextFloat();
        // System.out.println("Enter second number");
        // float b = sc.nextFloat();
        // float sum = a+b;
        // System.out.println("The Sum of two float values is:"+sum);

        /*********Use for String********/
        String str = sc.next();  //Only one word is print not fulline
        // String str = sc.nextLine();  In this fulline is printed
        System.out.println(str); 
        

        /*******To determine that user inter a value is integer or not******** */
        boolean bl = sc.hasNextInt();
        System.out.println(bl);
    }
}
