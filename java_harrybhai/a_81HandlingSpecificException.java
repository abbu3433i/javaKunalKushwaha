
import java.util.Scanner;

public class a_81HandlingSpecificException {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]=45;
        arr[1]=89;
        arr[2]=55;
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        System.out.println("Enter the index number");
        int ind = sc.nextInt();

        System.out.println("Enter divisible number");
        int number = sc.nextInt();
        
        try{
            System.out.println("The value of array index is: "+ arr[ind]);
            System.out.println("This no. is divisible and ans is: "+ arr[ind]/number);
        }
        catch(ArithmeticException e){
         System.out.println("ArithmeticException");
         System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println("ArrayIndexOutOfBoundsException");
         System.out.println(e);
        }
        catch(Exception e){
         System.out.println("This index is not exists in the array");
         System.out.println(e);
        }

    }
}
