import java.util.Scanner;

public class d_3BS2 {
    
    // /**********peak[large no.] point of mountainArray[first arr increse then decrease]********* */
    
    // public static void main(String[] args) {
    //     int[] arr = {1,2,5,8,10,15,4,2,1,0};
    //     System.out.println(peak(arr));
    // }//main

    // static int peak(int[] arr){
    //     int st=0;
    //     int end=arr.length;

    //     while(st<end){
    //         int mid = (st+end)/2;

    //         if(arr[mid]<arr[mid+1]){       
    //             st = mid+1;   //This is bec. mid chota he mid+1 se 
    //         }
    //         else{
    //             end=mid;   //This tells that you are in decending part of the array
    //         }
    //     }

    //     System.out.println("The peak value is: ");
    //     return end;
    // }





    /********To find target element with the help of peak as taken a [pivot] element{in which the target lies left side or right side of pivot}--of the given rotated sorted array**************** */

    // public static void main(String[] args) {
    //     int[] arr = {5,66,77,88,100,150,1,2,3,4};
    //     System.out.println(targetSearch(arr, 4));
        
    // }//main

    // //1.##Target element
    //  static int targetSearch(int[] arr , int target){
    //     int pivot = peakispivot(arr);

    //     if(pivot==-1)  //agar pivot nhi mila to mtlb arr rotated sorted nhi he
    //     {
    //         System.out.println("Something wrong!---normal binary search done");
    //        return binarySearch(arr, pivot, 0, arr.length-1);
    //     }
    //     //if pivot finds, then you have find 2 asc sorted arr
    //     if(arr[pivot]==target){
    //         System.out.println("Target value is equal to pivot value:");
    //         return pivot;
    //     }
    //     //Agar target arr ki start se bada hua to end index ko pivot-1 kar do
    //     if(target>=arr[0]){    
    //         return binarySearch(arr, target, 0, pivot-1);
    //     } 
    //     //Agar target arr ki start se chota hua to st index ko pivot+1 kar do
    //     if(target<=arr[0]){   
    //         return binarySearch(arr, target, pivot+1, arr.length-1);
    //     }

    //     return -1;
    // }

    // //2.##first find pivot or peak
    // static int peakispivot(int[] arr){
    //     int st=0;
    //     int end=arr.length;

    //     while(st<end){
    //         int mid = (st+end)/2;

    //         if(arr[mid]<arr[mid+1]){       
    //             st = mid+1;   //This is bec. mid chota he mid+1 se 
    //         }
    //         else{
    //             end=mid;   //This tells that you are in decending part of the array
    //         }
    //     }

    //     return end;
    // }

    // //3.##BinarySearch
    // static int binarySearch(int[] arr,int target, int st, int end){
    // while(st<=end){
        
    //     int mid = (st + end)/2;

    //     if(target<arr[mid]){
    //         end = mid-1;
    //     }

    //     else if(target>arr[mid]){
    //         st = mid+1;
    //     }

    //     else{
    //         System.out.println("Your target value is in index");
    //         return mid;
    //     }
    // }

    // System.out.println("Something wrong!---normal binary search done");
    // return -1;
    // }




    /**********Rotational count how many times arr rotated********* */
    
    // public static void main(String[] args) {
    //     int[] arr = {5,66,77,88,100,150,1,2,3,4};
    //     System.out.println(RotationalCount(arr));
    // }

    // static int RotationalCount(int[] arr){
    //     int pivot = peakispivot(arr);

    //     System.out.println("The arr is rotated is:");
    //     return pivot + 1;  //pivot jis index pe he usse +1 tak hoga rotational count kyuki pivot jab bhi count hoga to 0 index se hoga...
    // }
    // static int peakispivot(int[] arr){
    //     int st=0;
    //     int end=arr.length;

    //     while(st<end){
    //         int mid = (st+end)/2;

    //         if(arr[mid]<arr[mid+1]){       
    //             st = mid+1;   //This is bec. mid chota he mid+1 se 
    //         }
    //         else{
    //             end=mid;   //This tells that you are in decending part of the array
    //         }
    //     }

    //     return end;
    // }


    /*********square root with the help of binary search****** */

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n = sc.nextInt();

    //     System.out.println(squareroot(n));

    // }//main

    // static int squareroot(int n){
    //     int st = 0;
    //     int end = n;

    //     int ans = 0;//empty box which holds mid value 
    //     while(st<end){
    //         int mid = st+(end-st)/2;

    //         int square = mid*mid;  //jo bhi mid niklega uska squre kar dega

    //         if(n==square){      //agar n value jo bhi [mid ki square value] ke barabar hogi to mid return karna
    //             return mid;
    //         }
    //         if(square<n){    //agar n value jo bhi [mid ki square value] se badi hogi
    //             ans = mid;
    //             st = mid+1;
    //         }
    //         else{              //agar n value jo bhi [mid ki square value] se choti hogi
    //             end = mid-1;   
    //         }
    //     }
    //     return ans;

    // }



    /********To find large pivot element******** */

    // public static void main(String[] args) {
    //     int[] arr = {1,2,5,8,10,15,4,2,1,0};
    //     System.out.println(peak(arr));
    // }//main

    // static int peak(int[] arr){
    //     int st=0;
    //     int end=arr.length;

    //     while(st<end){
    //         int mid = (st+end)/2;

    //         if(arr[mid]<arr[mid+1]){       
    //             st = mid+1;   //This is bec. mid chota he mid+1 se 
    //         }
    //         else{
    //             end=mid;   //This tells that you are in decending part of the array
    //         }
    //     }

    //     System.out.println("The peak value is: ");
    //     return end;
    // }



    // /********To find small pivot element of the given sorted and rotational array**************** */

    // public static void main(String[] args) {
    //     int[] arr={3,7,9,15,1,2,5};    //arr divide in two part 3-15{sorted} and 1-5{sorted}
    //     System.out.println(pivot(arr));
    // }

    // static int pivot(int[] arr){
    //     int st = 0;
    //     int end =arr.length;

    //     while (st<end) {
    //         int mid = (st+end)/2;
            
    //         if(arr[mid]>=arr[0]){
    //             st = mid+1;
    //         }else{
    //             end=mid;
    //         }
    //     }
    //     System.out.println("Smallest value in index: ");
    //     return st; //(or end)
    // }







    /**************split arry Largest sum****************** */
    // public static void main(String[] args) {
    //     int[] arr={7,2,5,10,8};

    //     //here i creating class obj which can access not static fn.
    //     d_3BS2 obj = new d_3BS2();
    //     int a = obj.splitArray(arr, 2);
    //     System.out.println(a);
    // }

    // public int splitArray(int[] arr, int m){
    //     int start=0;
    //     int end=0;

    //     for(int i=0; i<arr.length; i++){
    //         start = Math.max(start, arr[i]);
    //         end += arr[i];
    //     }

    //     //binary search
    //     while (start<end) {
    //         //try  for middle as potential ans
    //         int mid = start + (end-start)/2;

    //         //calcuate how mant pices you can divided this in with this max sum
    //         int sum = 0;
    //         int pices = 1;
    //         for (int num : arr) {
    //             if(sum + num>mid){
    //                 sum = num; 
    //                 pices++;
    //             }
    //             else{
    //                 start += num;
    //             }
    //         }

    //         if (pices>m) {
    //             start = mid + 1;
    //         }else{
    //             end=mid;
    //         }


    //     }
    //     return end;
    // }

}//class
