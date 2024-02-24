import java.util.Scanner;

public class a_82NestedTry {
    public static void main(String[] args) {
         int [] arr = new int[3];
        arr[0]=45;
        arr[1]=89;
        arr[2]=55;

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter the index number");
        int ind = sc.nextInt();

    //  Exception handle by NestedTry--> try ke andar try
        try{
            System.out.println("Amit bigfan Hitman");
            try{
                System.out.println("The value is exits "+arr[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Exception is handled");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
