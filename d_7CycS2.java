import java.util.Arrays;

public class d_7CycS2 {
    /*************SetMissmatch mtlb which is duplicate and in the place of duplicate what element is come*************/

    public static void main(String[] args) {
        int[] arr = {4,2,1,2,5};
        System.out.println("Setmismatch:----");
        int[] nums = cyclicSort(arr);
        // System.out.println(nums);  refference print kar dega value ka/...
        System.out.println(Arrays.toString(nums)); //arrays.to string gives actual value of the array 
    }//main

    static int[] cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i]-1;  
            if(arr[i]<arr.length && arr[i] != arr[correct]){   
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
       //Missing number find here----
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){ 
                return new int[] {arr[index], index+1};  //here arr ki value--'duplicate' he or arr ka index--'missing' he 
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }//



    /*****amazon ques.********First missing integer[smallest missing positive integer ]**************** */

    // public static void main(String[] args) {
    //     int[] arr = {7,8,9,10};
    //     System.out.println("First missing no:--");
    //     System.out.println(cyclicSort(arr));
    //       }//main

    // static int cyclicSort(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correct = arr[i]-1;  
    //         if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]){   
    //             swap(arr, i, correct);
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //    //Missing number find here----
    //     for (int index = 0; index < arr.length; index++) {
    //         if(arr[index]!=index+1){ 
    //             return index+1;  //arr ki value or index mismatch ho to index+1 return kar do bahi smallest value he...
    //         }
    //     }
    //     return arr.length+1;   //----agar arr ki len tak koi missing elem nhi he to len+1 kar do len ke just baad bala missing hoga
    // }

    // static void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }//

}//class
