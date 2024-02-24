import java.util.Arrays;   //this will give like array format 
import java.util.Scanner;

public class Array_2 {
   
    // ***********1D Array list************
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter array");
        // for (int i = 0; i<arr.length; i++){
            //     arr[i] = sc.next();
            // }
            
            int[] arr = new int[5];
            arr[0] = 1;
            arr[1] = 11;
            arr[2] = 15;
            arr[3] = 45;
            arr[4] = 50;     


    //  'forEach' loop is used to print each element of the array 
        for(int num : arr) {           //'num' is reffrence which print every element of the array
            System.out.print(num+" ");  
        }

    //  print elements in the form of arraylist 
        System.out.println();
        System.out.println(Arrays.toString(arr));    
    }
}
