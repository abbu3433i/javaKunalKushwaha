import java.util.Arrays;

public class d_6Insertionsort {
    /*********************Insertion sort********************* */
    // worst case complexity = O(N^2);
    // Best case complexity = O(N);

    public static void main(String[] args) {
        int[] arr = {5,4,3,-22,-58,2,1,8,7};
        insertionSort(arr); 
        System.out.println(Arrays.toString(arr));
    }//main

    static void insertionSort(int[] arr){
        // 'i' arr.len-2 tak chalega kyuki i ko arr.len-1 tak chala diya to 'j' arr ke last element se +1 chala jayega jo out of bond ho jayega
        for (int i = 0; i < arr.length-1; i++) {
            //'j' phichle element se compare[swap] hoke decrease ho rha he..
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{    //agar swap nhi hua to loop break kar do kyuki L.H.S ke sare elem chote hi hongen
                    break;
                }
            }
        }
    }//

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }//


}//class
