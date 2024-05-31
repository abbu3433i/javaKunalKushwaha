//-------------------------------Quick sort-----------------------------------

import java.util.Arrays;

public class d_9Recursion6 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low ,int high){
        if (low >= high) {  //checks if the subarray has only one element or is empty, 
            return;         //in which case there's no need to sort further     
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while (s<=e) {
            while (arr[s] < pivot) {
                s++;                       //ye tab tak ++ hoga jab tak ki st pivot se bada na aa jaye or jese hi condition violet hui loop ruk jayega us element pe 
            }
            while (arr[e] > pivot) {
                e--;                       //same isme bhi hoga.......fir vilot bala end vilot vale st se swap ho jayega 
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
       //recursion call
        sort(arr, low, e);  //here end is now new one after swaping upside---This sorts the left subarray from low to the partition index e
        sort(arr, s, high); //here start is now new one after swaping upside----This sorts the right subarray from the partition index s to high.
    }

}
