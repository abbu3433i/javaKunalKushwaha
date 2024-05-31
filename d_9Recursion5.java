//---------------------------Merge sort---------------------------

import java.util.Arrays;

public class d_9Recursion5 {
    public static void main(String[] args) {
        int[] arr  ={5,4,3,2,1};
        arr = mergesort(arr);    // here original arr--- me mergesort ka jo bhi copy arr aya he use store karba diya 
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if (arr.length==1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));  //ye mid se left part le lega arr ka
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));  //or ye mid se right part le lega arr ki puri length tak

        return merge(left , right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];  //mix naam ka naya arr he jisme k refrence variable ki madad se value store hongi

        int i = 0;   //left side of arr
        int j = 0;   //right side of arr
        int k = 0;   //k is refrence to a new arr where the copy of left right is stored in sorted and merge form

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arr is not completed
        //copy the remaining elements
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }                                 //----ye dono me se ek chalega 
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

}
