import java.util.Scanner;

public class a_6Quiz {
    public static void main(String[] args){
        System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        float sum = ((a+b+c+d+e)/500.0f)*100;
        System.out.println("Total marks you goted is: "+sum+"%");
    }
}
