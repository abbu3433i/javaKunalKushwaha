package leetcode;

public class Q_1Leetcode {

    /********Given an array nums of integers, return how many of them contain an even
             number of digits.*********/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int a = findnumber(nums);
        System.out.println("The even no of digit is: "+a);
    }

    static int findnumber(int[] nums){
        int count = 0;
        for ( int val : nums) {    //har ek value ko nums me se lega or val me dalega
            if(even(val)){    //even fn chalayega jo niche diya he 
                count++;      //agar value true hui to count++ krr dega
            }
        }
        return count;
    }


    static boolean even(int val){
        int numberOfdigit = chekdigit(val);  //Ye "fn." check karega digit even he ya nhi,
        if(numberOfdigit%2==0){             //agar even hui to true return karega nhi to false
            return true;               
        }
        return false;
    }

    static int chekdigit(int val){     //ye fn. digit count karega ki kitni digit he
        int count = 0;
        while (val>0) {
            count++;
            val = val/10;
        }
        return count;
    }





    /***************Find the richest person has a max wealth************** */
    
    // public static void main(String[] args) {
    //     int[][] arr = {
    //         {1,2,3},    //person1 sum[1+2+3=6]
    //         {3,2,2}     //person2 sum[3+2+2=7]
    //     };

    //     int a = maxwealth(arr);
    //     System.out.println("The richest person with maxWidth is: "+a);
    // }

    // static int maxwealth(int[][] arr){
    //     int ans = 0;
    //     for(int person=0; person<arr.length; person++){
    //         int sum = 0;
    //         for(int account=0; account<arr[person].length; account++){
    //             sum+=arr[person][account];
    //         }
    //         if(sum>ans){
    //             ans = sum;
    //         }
    //     }
    //     return ans;
    // }
}
