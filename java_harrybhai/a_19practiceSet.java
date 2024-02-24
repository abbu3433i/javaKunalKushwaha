import java.util.Scanner;
// *******Job related Quiz********
public class a_19practiceSet {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter your chemistry marks");
        int m1 = sc.nextInt();

        System.out.println("Enter your maths marks");
        int m2 = sc.nextInt();

        System.out.println("Enter your physics marks");
        int  m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your avg marks is:" + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation Sir! you are promoted");
        }
        else{
           System.out.println("Sorry sir! you have not promoted");
        }
      }
}
