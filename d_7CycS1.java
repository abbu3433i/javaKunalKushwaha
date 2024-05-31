import java.util.Arrays;

public class d_7CycS1 {
    /*************To find missing number in given range(0,arr.len)*********** */

    public static void main(String[] args) {
        int[] arr = {0,4,2,1};
        System.out.println("Missing element is:--");
        System.out.println(cyclicSort(arr));
    }//main

    static int cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i];  //check karengen a[i] isliye liya he kyuki arr ki value 0 se st hui he jo index 0 pe hi aayegi mtlb sari value apni value index pe hi aayegi..
            //agar arr ki value uske kudh ki index ki value se not equal ho to swap kar do...
            if(arr[i]<arr.length && arr[i] != arr[correct]){   
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
       //Missing number find here----
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;  //means N value which is out of the arr.length
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }//




    /*****[amazone question]***********To find all missing number in giver range which is(1,arr.length)*************** */

    // public static void main(String[] args) {
    //     int[] arr = {4,2,1,6,8,9,10};
    //     System.out.println("All Missing element is:--");
    //     cyclicSort(arr);
    // }//main

    // static void cyclicSort(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correct = arr[i]-1;  
    //         if(arr[i]<arr.length && arr[i] != arr[correct]){   
    //             swap(arr, i, correct);
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //    //Missing number find here----
    //     for (int index = 0; index < arr.length; index++) {
    //         if(arr[index]!=index+1){  //index+1 karengen to bo index ki value ke equal aayega...nhi aaye to bo index+1 missing he..
    //             System.out.print(index+1+" ");
    //         }
    //     }
    // }

    // static void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }//



    /****[amazone]********Find the duplicate no in the given range(1,n)***************** */

    // public static void main(String[] args) {
    //     int[] arr = {4,2,1,2,5,3};
    //     System.out.println("All Duplicate numbers is:--");
    //     cyclicSort(arr);
    // }//main

    // static void cyclicSort(int[] arr){
    //     int i=0;
    //     while (i<arr.length) {
    //         int correct = arr[i]-1;  
    //         if(arr[i] != arr[correct]){   
    //             swap(arr, i, correct);
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //    //Duplicate number find here-----
    //     for (int index = 0; index < arr.length; index++) {
    //         if(arr[index]!=index+1){  //arr ki jo value he bo arr index+1 se match nhi ho rhi..to smj jao arr ki value hi duplicate ele he 
    //             System.out.print(arr[index]+" ");   //so arr[index]--value print kara do
    //         }
    //     }
        
    // }

    // static void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }//

}//class
