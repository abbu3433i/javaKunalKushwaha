public class d_9Recursion1 {
    // // ***********Basic version of recursion with same body***********
    // public static void main(String[] args) {
    //      print1(1);
    // }

    // static void print1(int n){
    //     System.out.println(n);
    //     print2(2);
    // }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }
    // static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n){
    //     System.out.println(n);
    //     print5(5);
    // }
    // static void print5(int n){
    //     System.out.println(n);
    // }


    /*************************Fabonacci series with recursion************************** */
    // public static void main(String[] args) {
    //     int n = 4;
    //     System.out.println(fabo(n));
    // }

    // static int fabo(int n){
    //     if (n==1){
    //         return 1;
    //     } 
    //     if (n==0){
    //         return 0;
    //     } 
    //     return fabo(n-1)+fabo(n-2);
    // }

/************************Binary search using recursion*************************** */
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,5,6,66,68,78};
    //     int target = 78;
    //     System.out.println("The value is in index:");
    //     System.out.println(search(arr, target, 0, arr.length-1));

    // }
    // static int search(int[] arr, int target, int st, int end){
    //     if (st>end) {
    //         return -1; 
    //     }
    //     int mid = st +(end-st)/2;

    //     if (arr[mid]==target) {
    //         return mid; //-------This will return ans when base condition meets
    //     }
    //     if (target>arr[mid]) {
    //         return search(arr, target, mid+1, end); //---here fun callitself this is recursion
    //     }
    //     else{
    //         return search(arr, target, st, mid-1);
    //     }
    // }

}
