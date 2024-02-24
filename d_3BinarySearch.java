public class d_3BinarySearch {
    public static void main(String[] args) {
        
        /****************This will working only for sorted array[Ascending order]****************** */
        int[] arr = {-18,-14,-9,-2,0,15,17,25,38,45,50};
        int target = 38;
        System.out.println(binarySearch(arr,target));    
    }//main

       //Method
        static int binarySearch(int[] arr,int target){
            int st=0;
            int end = arr.length-1;

        while(st<=end){
            
            int mid = (st + end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }

            else if(target>arr[mid]){
                st = mid+1;
            }

            else{
                System.out.println("Your target value is in index");
                return mid;
            }
        }

        return -1;
        }





    //     /****************OrderAgnosticBS[check either it is ASC or DESC]****************** */

    //     // int[] arr = {-18,-14,-9,-2,0,15,17,25,38,45,50};  //ASC
    //     int[] arr = {99,45,35,20,14,9,3,0,-78,-89};          //DESC
    //     int target = -89;
    //     System.out.println(binarySearch(arr,target));
        
    // }//main

    //    //Method
    //     static int binarySearch(int[] arr,int target){
    //         int st=0;
    //         int end = arr.length-1;

    //         boolean isASC = arr[st]<arr[end];  //ye check karega ki arr ASC me he ya DESC me

    //     while(st<=end){
            
    //         int mid = (st + end)/2;

    //         // target==mid same ho to
    //         if(target==arr[mid]){
    //             System.out.println("Your target value is in index");
    //             return mid;
    //         }

    //         //ASCending order
    //         if(isASC){
    //             if(target<arr[mid]){
    //             end = mid-1;
    //           }
    //         else {
    //             st = mid+1;
    //           }
    //         }

    //         // DEScending order
    //         else{
    //             if(target>arr[mid]){
    //             end = mid-1;
    //            }
    //         else {
    //             st = mid+1;
    //            }
    //         }
            
    
    //     }

    //     return -1;
    //     }




}//class
