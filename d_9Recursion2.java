public class d_9Recursion2 {
    public static void main(String[] args) {
        // fun(6);
        funReverse(5);
    }
    /*************Recursion always decrease the no*****************/
    static void fun(int n){
        if (n==0) {
            return;
        }
        System.out.println(n); //-----Here first print n than fun goes n-1;
        fun(n-1);
    }

    /***********here in incresing wise print the no**********/
    static void funReverse(int n){
        if (n==0) {
            return;
        }
        funReverse(n-1);   //-----Here first fun goes n-1 than jab last me funRev ki value 1 ho jayegi fir sout hoga similarly jo fn recently call ho chuke hen unka bhi sout print hoga jisse no. syncronusly print ho jayegen
        System.out.println(n);
    }




//---------------------Factorial-------------------
// public static void main(String[] args) {
//     int ans = fac(5);
//     System.out.println(ans);
// }

// static int fac(int n){
//     if (n<=1) {
//         return 1; //jahan return hojayega uske baad fn nhi chalega
//     }

//     return n * fac(n-1);
// }



//---------------------Factorial ka sum-------------------
// public static void main(String[] args) {
//     int ans = sum(5);
//     System.out.println(ans);
// }

// static int sum(int n){
//     if (n<=1) {
//         return 1; //jahan return hojayega uske baad fn nhi chalega
//     }

//     return n + sum(n-1);
// }



// //------------------------Sum of digit whatevent we give 123=>1+2+3---------------------------
// public static void main(String[] args) {
//     int ans = digitsum(5125);
//     System.out.println(ans);
// }

// static int digitsum(int n){
//     if (n==0) {
//         return 0;
//     }

//     return (n%10) + digitsum(n/10);
//  }


//------------------------product of digit whatevent we give 123=>1*2*3---------------------------
// public static void main(String[] args) {
//     int ans = digitprod(5125);
//     System.out.println(ans);
// }

// static int digitprod(int n){
//     if (n%10==n) {  //----if one digit is reamaining return that digit similarly we can apply this in sum of digit as well
//         return n;
//     }

//     return (n%10) * digitprod(n/10);
//  }



/***************** n-- vs --n ***************** */
// public static void main(String[] args) {
//     concept(5);
// }

// static void concept(int n){
//     if (n==0) {
//         return;
//     }
//     System.out.println(n);
//     // concept(n--);    //---------this will give infinite time five mtlb ye phele 5 return kar rha fir fun(5-1) chala rha and fun(5-1) fir 5 return karega again fun(5-1) cahlega this will run continuously until stack not full
//     concept(--n);      //------ye phele substract karga fir n return karega
// }




/**********************Reverse the number with the help of recursion**************** */
//###-------Way 1
// static int sum = 0;  //created sum variable outside the rev1 function
// static void rev1(int n){
//     if (n==0) {
//         return;
//     }
//     int rem = n%10;
//     sum = sum*10 + rem;
//     rev1(n/10);
// }

//###----------way 2
// static int rev2(int n){
//     int digit  = (int)(Math.log10(n)) + 1;  //integer value ko count karega st 0 se karega isliye +1 liya he
//     return helper(n,digit);
// }
//  private static int helper(int n,int digit){
//     if (n%10==n) {
//         return n;
//     }
//     int rem = n%10; //remainder nikla to ab kitni digit bachi -1 ho jayega
//     //-------10 ki power digit -1 kar do
//     return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
// }


// //###-----------------------palindron number----------
// static boolean palindrom(int n){
//     return n == rev2(n);
// }

// public static void main(String[] args) {
//     // rev1(12345); //way 1 
//     // System.out.println(sum);

//     // System.out.println(rev2(12345));  //way 2 

//     int n = 1234321;
//     if (palindrom(n)) {
//         System.out.println(n+" is palindron no.");
//     }
//     else{
//         System.out.println(n+" is not palindron no.");
//     }
// }




/***************************Count number of zeros************************/
// public static void main(String[] args) {
//     System.out.println("The no of zeros is ");
//     System.out.println(count(302004));
// } 

// static int count(int n){
//     return helper(n, 0);  //---initially count ki value 0 he 
// }

//  private static int helper(int n,int c){
//     if (n==0) {  
//         return c;   //---jab n ki value 0 ho jaye c return kar do
//     }

//     int rem = n%10;
//     if (rem==0) {        //---jab bhi 0 mile count +1 kar do
//         return helper(n/10, c+1);
//     }

//     return helper(n/10, c);
// }



//leetcode Ques.
/************************check the no. of step it taken to reduce it to zero******************* */

/*
*   Example 1:
*   opus num = 14
*   output: 6
*   Explanation:
*   Step 1) 14 1s even; divide by 2 and obtain 7.
*   Step 2) 7 is odd; subtract 1 and obtain 6.
*   Step 3) 6 is even; divide by 2 and obtain 3.
*   Step 4) 3 is odd; subtract 1 and obtain 2.
*   Step 5) 2 is even; divide by 2 and obtain 1.
*   Step 6) 1 1s odd; subtract 1 and obtain 0.
*/


// public static void main(String[] args) {
//     System.out.println("The no. of steps it taken is ");
//     System.out.println(stepcount(14));
// }

// static int stepcount(int n){
//     return helper(n , 0);
// }
// static int helper(int n,int steps){
//     if (n==0) {
//         return steps;
//     }

//     if (n%2==0) {
//         return helper(n/2, steps+1);
//     }
//     else{
//         return helper(n-1, steps+1);
//     }
// }


}//class
