public class d_9Recursion2 {
//     public static void main(String[] args) {
//         // fun(6);
//         funReverse(5);
//     }
//     /*************Recursion always decrease the no*****************/
//     static void fun(int n){
//         if (n==0) {
//             return;
//         }
//         System.out.println(n); //-----Here first print n than fun goes n-1;
//         fun(n-1);
//     }

//     /***********here in incresing wise print the no**********/
//     static void funReverse(int n){
//         if (n==0) {
//             return;
//         }
//         funReverse(n-1);   //-----Here first fun goes n-1 than jab last me funRev ki value 1 ho jayegi fir sout hoga similarly jo fn recently call ho chuke hen unka bhi sout print hoga jisse no. syncronusly print ho jayegen
//         System.out.println(n);
//     }




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

}//class
