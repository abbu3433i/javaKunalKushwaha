
import java.util.Arrays;


public class d_4Bubblesort {
    /******************Bubble sort********************/
    
    public static void main(String[] args) {
        int[] arr={-56,-78,-98,26,0,-5,5,2,3,4,8,7,9,1};
        bubblesort(arr); //calling ho gai
        System.out.println(Arrays.toString(arr));  //arr ko array ke format me store kar diya with the help of giving 'arr' inside the tostring
    }//main


    static void bubblesort(int[] arr){
        // i to arr.len se 1 kam value tak iteration chalayega
        for (int i = 0; i <=arr.length-1; i++) {
            boolean notswapp = false;
            // j-->i-- ki har iteration pe sari value check karke swap karayega
            // j-> arr.len-1[mtlb 2 kam chalega bec it is lessthan j] tabhi last element arr[j+1] arr[j] se swap ho payega---nhi to out of bond bata dega
            for (int j = 0; j < arr.length-1-i; j++) {

                if(arr[j]>arr[j+1]){  //arr value uske aage bali se compare hogi
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    notswapp = true;  //ye just notswap ki value true kar dega
                }
            }

            //agar first iteration me saari values me se 1 bhi swap na ho to loop break kar do..isse memory kam use hoga
            if(notswapp==false){
                break;
            }
        }
    }

   
}//class
