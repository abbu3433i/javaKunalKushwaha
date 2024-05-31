import java.util.Arrays;

public class d_7Cyclicsort {
    /*****************Cyclic sort**************** */
    // This will work on given range like (0,n)
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while (i<=arr.length-1) {
            int correct = arr[i]-1;  //check kro-- arr ka element -1 ho rha he jese 8=> 8-1 = 7 index bala elem
            //not equal to
            if(arr[i] != arr[correct]){   //jab arr ki value uske correct index[arr[i]-i] ke equal na ho to "swap kar do" or equal ho to "No swap only increment"...
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        
    }//
    

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
