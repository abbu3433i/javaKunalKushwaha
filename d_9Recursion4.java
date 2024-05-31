import java.util.Arrays;

/************************Pattern ques with the help of recursion**********************/
public class d_9Recursion4 {
    public static void main(String[] args) {
        increment(4, 0);
    }

    static void decrement(int r, int c){
        if (r==0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            decrement(r, c+1);
        }
        else{
            System.out.println();
            decrement(r-1, 0);
        }
    }

    static void increment(int r, int c){
        if (r==0) {
            return;
        }
        if (c < r) {
            increment(r, c+1);      //4 no ki row me 4 start print kar dega 
            System.out.print("* ");
        }
        else{
            increment(r-1, 0);     //ek ek kar ke row -1 karega fir last me line me gap dega
            System.out.println();
        }
    }


    /***********************Bubble sort using recursion********************* */

//     public static void main(String[] args) {
//         int[] arr = {4,3,2,1};
//         bublesort(arr , arr.length-1 , 0);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void bublesort(int[] arr, int r, int c){
//         if (r==0) {
//             return;
//         }

//     if (c < r) {  

//         if (arr[c] > arr[c+1]) {  //ye agar value choti hogi to swap karega
//             //swap
//             int temp = arr[c];
//             arr[c] = arr[c+1];
//             arr[c+1] = temp;
//         }
//         bublesort(arr, r, c+1);  //ye arr ki sari colom value pe iterate hoga
//         }
//         else{
//             bublesort(arr, r-1, 0); //ye arr ki value ki len ko har baar -1 karega jab bhi ye call hoga taki bo last ki sorted value ko chod ke...aage unsorted pe kaam kare
//         }

// }



/**********************Selection sort using recursion*********************** */
//     public static void main(String[] args) {
//         int[] arr = {4,3,2,1};
//         selection(arr , arr.length , 0 , 0); 
//         System.out.println(Arrays.toString(arr));
//     }

//     static void selection(int[] arr, int r, int c,int max){
//         if (r==0) {
//             return;
//         }

//     if (c < r) {  

//         if (arr[c] > arr[max]) {
//             selection(arr, r, c+1, c);  //max ko c kar dena mtlb c ki value max me store ho jayegi
//         }
//         else{
//             selection(arr, r, c+1, max);  
//         }
//     }
//         else{
//             int temp = arr[max];
//             arr[max] = arr[r-1];
//             arr[r-1] = temp;

//             selection(arr, r-1, 0 , 0);  //max ko bapas 0 kar do
//         }

// }


}//class

