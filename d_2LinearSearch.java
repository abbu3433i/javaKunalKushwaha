import java.util.Arrays;

public class d_2LinearSearch {
    /***********Linear search return the "index" of element************ */
    
    // public static void main(String[] args) {
    //     int[] arr = {1 ,45, 98, 54, 78, 5 ,7 ,9, 2, 6};
    //     int target = 9;
    //     int ans = Linearsearch(arr , target);
    //     System.out.println("The target element is in index of: "+ans);
    // }

    // static int Linearsearch(int[] arr , int target){
    //  for(int index = 0; index<arr.length; index++){
    //     int element  = arr[index];
    //     if(element==target){
    //         return index;
    //     }
    //  }
    //  return -1;
    // }




    /************Linear search [techneque2] this time return the "element"*********** */
    
    // public static void main(String[] args) {
    //     int[] arr = {1 ,45, 98, 54, 78, 5 ,7 ,9, 2, 6};
    //     int target = 9;
    //     System.out.println(Linearsearch(arr,target));
    //     }

    //     static int Linearsearch(int[] arr , int target){
    //     for (int element : arr) {
    //         if(element == target){
    //             return element;
    //         }
    //     }
    //     return -1;
    // }




    /***************Linear search for 2D array************ */
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,14,56},
//             {45,89,78,23},
//             {5,6,8,3,7}
//         };
//         int target =23;
//         // int[] ans = search2D(arr, target);
//         System.out.println(Arrays.toString(search2D(arr, target)));

//         // System.out.println((search2D(arr, target)));  //This will give address of the new arr..
//     }//main

//   //return type "int[]" dena padega agar row,col ko array me store karana ho to...
//     static int[] search2D(int[][] arr,int target){
//         //row
//         for(int row = 0; row<arr.length; row++){
//             //column
//             for(int col = 0; col<arr[row].length; col++){
//                //loop ke hisaab se jis bhi row and col pe target equal hua...to ruturn kr dena row,col
//                 if(arr[row][col]==target){
//                     return new int[]{row,col};  //this store row and col value in new arr
//                 }
//             }
//         }
//         return new int[]{-1,-1};
     
//     }




}


