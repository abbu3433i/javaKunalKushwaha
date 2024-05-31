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



    /*****************Linear search on string****************** */

    //    public static void main(String[] args) {
    //     String str = "abhishek";
    //     char target = 's';
    //     System.out.println(search(str,target));
    //     // System.out.println(Arrays.toString(str.toCharArray())); //---this will convert the strign in array format
    //    }

    //    static boolean search(String str ,char target){
    //     if (str.length()==0) {
    //         return false;
    //     }
    //     for (int i = 0; i < str.length(); i++) {  //---string pe iterate ho rha he
    //         if (target==str.charAt(i)) {    //---jese hi string ke character se target match hua return kar dega 
    //             return true;
    //         }
    //     }

    //    //--------------By enhance forEach loop------
    //    //    for(char ch: str.toCharArray()){
    //    //     if (ch == target) {
    //    //        return true;
    //    //     }
    //    //   }


    //     return false;
    //    }



    /***************Linear search for 2D array************ */

//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,14,56},
//             {45,89,78,23},
//             {5,6,8,3,7}
//         };
//         int target =23;
//         // int[] ans = search2D(arr, target);  //---array me value aa rhi he to..array me hi store karwana padega
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
//                     return new int[]{row,col};  //new keyword se ek new array banaya or usme row,col store karba diya
//                 }
//             }
//         }
//         return new int[]{-1,-1};
     
//     }




//similarly we can also find max value in 2Darray ---------------------------






/***************find numbers with even no. of digit [mtlb arr ke element ki digit count kro or number batao kitne even element he]************* */

// public static void main(String[] args) {
//     int[] arr = {12,345,2,6,7896,20,1,123456};
//     System.out.println(searcher(arr));
// }

// static int searcher(int[] arr){
//     int ans = 0;
//     for (int i = 0; i < arr.length; i++) {
//         int count=0;
//         while (arr[i]>0) {
//         int rem = arr[i]%10;
//         count++;
//         arr[i] = arr[i]/10;
//         }
//         if (count%2==0) {
//             ans++;
//         }
//     }
//     return ans;
// }



/******************Richest customer wealth******************* */
// public static void main(String[] args) {
//     int[][] arr = {
//         {1,2,3}, //--customer 1
//         {3,2,1}  //---customer 2
//     };
//     System.out.println(Richestwealth(arr));
// }

// static int Richestwealth(int[][] arr){
//     int ans = 0;
//     for (int person = 0; person < arr.length; person++) {
//         int sum = 0;
//         for (int account = 0; account < arr[person].length; account++) {
//             sum += arr[person][account];  //----row 1st ki sari col value ko sum me add kar do
//             if (ans<sum) {
//                 ans = sum;
//             }
//         }
        
//     }
//     return ans;
// }

}//class


