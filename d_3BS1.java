import java.util.Arrays;

public class d_3BS1 {
    // public static void main(String[] args) {
    //     /*1.*********ceiling me target value se next greater value hi milegi hamesha************ */

    //     int[] arr = {2,3,5,9,14,16,18};
    //     int target = 10;
    //     System.out.println(ceiling(arr,target));    
    // }//main

    //    //Method
    //    //***ceiling---(smallest no.) >= (target)***
    //     static int ceiling(int[] arr,int target){
    //         int st = 0;
    //         int end = arr.length-1;

    //     while(st<=end){
            
    //         int mid = (st + end)/2;

    //       //arr ki length ki last value se target bada ho to -1 return karna
    //         if(target>arr[arr.length-1]){
    //             return -1;
    //         }
    //         if(target<arr[mid]){
    //             end = mid-1;
    //         }

    //         else if(target>arr[mid]){
    //             st = mid+1;
    //         }

    //         else{
    //             System.out.println("Your target value is in index");
    //             return mid;
    //         }
    //     }

    //     return st;    //here st value will return [mid+1]
    //     }





    //     /***2.********Floor me target value se before smaller value hi milegi hamesha************ */

    // public static void main(String[] args) {
    //     int[] arr = {2,3,5,9,14,16,18};
    //     int target = 19;
    //     System.out.println(Floor(arr,target));    
    // }//main

    //    //Method
    //    //***Floor--(greatest no.) <= (target) ***
    //     static int Floor(int[] arr,int target){
    //         int st = 0;
    //         int end = arr.length-1;

    //     while(st<=end){
            
    //         int mid = (st + end)/2;

    //         //arr ki length ki last value se target bada ho to -1 return karna
    //         if(target>arr[arr.length-1]){
    //             return -1;
    //         }

    //         if(target<arr[mid]){
    //             end = mid-1;
    //         }

    //         else if(target>arr[mid]){
    //             st = mid+1;
    //         }

    //         else{
    //             System.out.println("Your target value is in index");
    //             return mid;
    //         }
    //     }

    //     return end;    //here end value will return [mid-1]
    //     }

        


    /*********[FB interview question]******first ans last index of the target element******* */

    // public static void main(String[] args) {
    // int[] num = {2,0,3,3,3,3,3,3,3,3,18,20};
    // int target = 3;
  
    //     int start = search(num, target, true);
    //     int ending= search(num, target, false);
    //     System.out.println(start+": start index of the arr---");
    //     System.out.println(ending+": end index of the arr---");
    
    // }//main

    //    //ye esa function he jo st index or last index dono ki value dega
    //    //agar condition[True hui to st index ke liye chalega], condition[False hui to last index ke liye chalega]
    //     static int search(int[] num,int target, boolean firstindex){
    //         int ans = -1;

    //         int st = 0;
    //         int end = num.length-1;

    //     while(st<=end){
    //         int mid = (st + end)/2;

    //         if(target<num[mid]){
    //             end = mid-1;
    //         }
    //         else if(target>num[mid]){
    //             st = mid+1;
    //         }
    //         else{
    //             ans = mid;

    //             //true he to mid se left side me fir se chala dega 
    //             if(firstindex){
    //                 end = mid-1;
    //             }
    //             //false he to mid se right side me fir se chala dega 
    //             //lastindex chalayega
    //             else{ 
    //                 st = mid+1;
    //             }
    //         }
    //     }

    //     return ans;   
    //     }





    /**********[Amazone ques..]*******find the position of the element in sorted array of infinity number**************** */

    // public static void main(String[] args) {
    //     int[] arr = {2,3,5,9,14,16,18,19,21,45,56,58,60,61,62,63,64,65,66,67,68,69,70};//--infinite length
    //     int target = 68; 
    //     System.out.println(ans(arr, target));
    // }//main

    // static int ans(int[] arr,int target){

    //     int start=0;
    //     int end=1;
    //     while(end <arr.length && target > arr[end]){
    //         int newstart = end+1;

    //         end = end + (end - start +1) * 2;
    //         start = newstart;
    //     }

    //     return binarySearch(arr, target, start, end);
    // }


    // static int binarySearch(int[] arr,int target,int start, int end){
    // while(start<=end){

    //    int mid = start + (end-start)/2;

    //     if(target<arr[mid]){
    //         end = mid-1;
    //     }

    //     else if(target>arr[mid]){
    //         start = mid+1;
    //     }

    //     else{
    //         System.out.println("Your target value is in index");
    //         return mid;
    //     }
    // }

    // return -1;
    // }


    
    // /**********peak[large no.] point of mountainArray[first increse then decrease]********* */
    
    // public static void main(String[] args) {
    //     int[] arr = {1,2,5,8,10,15,4,2,1,0};
    //     System.out.println(peak(arr));
    // }

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

    }//class

