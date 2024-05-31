import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args) {
// *************2D Array *************
        int[][] arr2D = {  
            {1,2,3},           //
            {7,2},             //----all three store in heap but take different memory
            {5,8,3,9}          //
        };

         //output 
         //arr ki 'Every row' ke element ko print kar do
        //  for (int[] row : arr2D) {
        //     System.out.println(Arrays.toString(row));
        //  }



        
         /**********Taking user input in 2D array********* */

        // Scanner sc = new Scanner(System.in);
        // int[][] arr2 = new int[3][3]; //-----------------------
        // System.out.println(arr2.length);    //no of row

        // //input
        // for(int row=0; row< arr2.length; row++){
        //     //for column
        //     for(int col=0; col< arr2[row].length; col++){
        //         arr2[row][col] = sc.nextInt();
        //     }
        // }

        // //output
        // for(int row=0; row< arr2.length; row++){
        //     System.out.println(Arrays.toString(arr2[row]));
        // }
        

    /******************max value in 2D array************* */

// public static void main(String[] args) {
//         int[][] arr = {
//             {1,14,56},
//             {45,89,78,23},
//             {5,6,98,3,7}
//         };
//         System.out.println(max2D(arr));
//     }//main

//     static int max2D(int[][] arr){
//         int max = arr[0][0];  //max value is taking start value of arr[row wise as well as col wise]

//         for(int row = 0; row<arr.length; row++){
//             for(int col = 0; col<arr[row].length; col++){
//                 if(arr[row][col]>max){
//                     max = arr[row][col];
//                 }

//             }
//         }
//         return max;
    }



}//class
