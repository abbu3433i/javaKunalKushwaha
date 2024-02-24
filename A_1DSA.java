
import java.util.Scanner;

public class A_1DSA {
    
//1. *********To find how many times the same no. will repeate********

/*     public static void main(String[] args) {
        int n = 125653595;  
        int count = 0;
        while(n>0){
            int rem = n%10;   //ye n ki lase value(Remainder) dega
             if(rem==5){
                count++;
             }
             n=n/10;       //ye n ki aage ki value dega
        }
         System.out.println(count);
    }
*/



//2. ***********Reverse the given number************

/*     public static void main(String[] args) {
        int n = 123456;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans * 10 + rem;     //60, 650, 6540, 65430, 654320, 654321 mtlb 0 ki place rem(value) le lega
            n = n/10;
        }
        System.out.println(ans);
    }
 */

 
 
//3. **************operators in java*************

/*  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter operator: ");

    char a = sc.next().charAt(0);  //This will imp "0" will represent index no. of the string

    System.out.println("Enter values:");
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a=='-' || a=='+' || a=='*'|| a=='x'||a=='%'||a=='/'){
        if(a=='-'){
            System.out.println(b-c);
        }
        else if(a=='+'){
            System.out.println(b+c);
        }
        else if(a=='*'){
            System.out.println(b*c);
        }
        else if(a=='/'){
            System.out.println(b/c);
        }
        else if(a=='%'){
            System.out.println(b%c);
        }
        else if(a=='x'){
            System.out.println(b*c);
        }
        else{
            System.out.println("Invalid operator");
        }
    }
    else{
        System.out.println("Invalid operator");
    }
}  */



// 4. *********Switch statement********

/* public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter fruit name: ");
String fruits = sc.next();

switch (fruits) {
    case "mango":
    System.out.println("so sweet");
    break;

    case "apple":
    System.out.println("so happy");
    break;

    case "banana":
    System.out.println("so healthy");
    break;

    default:
    System.out.println("valid fruit khaya krr bahi");
    }
  }   */


// 5.*********Swap two numbers************

/*public static void main(String[] args) {
    int a = 10;
    int b = 20;

//  Swap number code
    int temp = a;  
    a = b;             //----Trick for swap----
    b = temp;          //--'st' with temp and 'end' with temp

    System.out.println(a+"<-a  b->"+b);
    }   */

 





    //6.***********swaping in array******************

    //     public static void main(String[] args) {
        
    //     int[] arr = {1 ,5 ,25 ,19 ,81};
    //     swap(arr,0,4);  //here giving index no. which we want to swap
    //     System.out.println(Arrays.toString(arr)); 
    // }

    //     static void swap(int[] arr, int index1,int index2){
    //         int temp = arr[index1];
    //         arr[index1] = arr[index2];
    //         arr[index2] = temp;
    //     }




/*7.**************Reverse the array with the help of swap function********** */

/******Two pointer method one pointer in start index and another pointer in end index
 * then swap each other and increment 'st index' , decrement 'end index' again swap..until array is reverse***** */
//   static void Reverse(int[] arr){
//     int start = 0;
//     int end = arr.length-1;
//     while(start<end){
//         swap(arr, start, end);
//         start++;
//         end--;
//     }
//   }

//   static void swap(int[] arr, int index1,int index2){
//             int temp = arr[index1];
//             arr[index1] = arr[index2];
//             arr[index2] = temp;
//         }
//   public static void main(String[] args) {
//     int[] arr = {1 ,5 ,25 ,19 ,81};
    
//     Reverse(arr);
//     System.out.println(Arrays.toString(arr));
//   }




/*8.************TO find max value in array************/

//     public static void main(String[] args) {
//         int[] arr = {1 ,5 ,25 ,19 ,81};
        
//         System.out.println(maxvalue(arr));
//     }

//  /* "0 index" ko max value assume krr li then is maxvalue ko arr ki har 
//     index se compare kro jo value max se badi ho usse max me store krba do.. */
//         static int maxvalue(int[] arr){
//             int max = arr[0];
//             for(int i=0; i<arr.length; i++){
//                 if (arr[i]>max) {
//                     max = arr[i];
//                 }
//             }
//             return max;
//         }





/*9.************TO find min value in array************/

    // public static void main(String[] args) {
    //     int[] arr = {1 ,5 ,25 ,19 ,81,-7};
        
    //     System.out.println(minvalue(arr));
    // }

    //     static int minvalue(int[] arr){
    //         int min = arr[0];
    //         for(int i=0; i<arr.length; i++){
    //             if (min>arr[i]) {
    //                 min = arr[i];
    //             }
    //         }
    //         return min;
    //     }

        



/*10.****************To find MAX no by Rangewise what is it given by user in array**************** */

//  public static void main(String[] args) {
//         int[] arr = {1 ,5 ,25 ,19 ,81}; 

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter starting index");
//         int a = sc.nextInt();
//         System.out.println("Enter end index");
//         int b = sc.nextInt();

//         System.out.println(maxRange(arr,a,b));   // "st index" se "end index" tak
//     }

//         static int maxRange(int[] arr, int start, int end){
//             int maxR = arr[start];
//             for(int i = start; i<=end; i++){
//                 if (arr[i]>maxR) {
//                     maxR = arr[i];
//                 }
//             }
//             return maxR;
//         }


/*11.**************Sum all the values in array************** */

// public static void main(String[] args) {
//     int[] arr={1,25,4,8,9,5};
//     int sum=0;
//     for(int i=0; i<arr.length; i++){
//         sum+=arr[i];
//         // sum+=i;   index value add karega
//     }
//     System.out.println(sum);
// }
}







