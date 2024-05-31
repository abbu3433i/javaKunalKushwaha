import java.util.Arrays;

//phele max value nikaro arr me se fir us max value ko last value ke sath swap kar do fir arr.len -1 kar do then again do
public class d_5Selectionsort {
    /*******************Selection sort***************** */
    public static void main(String[] args) {
        int[] arr={-56,-78,-98,26,0,-5,5,2,3,4,8,7,9,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i <=arr.length-1; i++) {

            int last = arr.length-1-i;  //i iteration ke hisaab se har baar last value change hogi 
            int maxIndex = maxvalue(arr, last); //maxvalue fn. call hua

            swap(arr, maxIndex, last);  //swap fn. call hua
        }
    }//


    static int maxvalue(int[] arr, int last) {
        int st = 0;
        int end = last;
        int max = 0;
        for (int i = st; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}//class
