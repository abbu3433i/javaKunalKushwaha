import java.util.Scanner;
public class hello {
  //  without parameter without return value
  //  without parameter with return value
  // ** with parameter without return value
  // ** with parameter with return value

 
  
  
// // *******To print all even number to n
//   public static void main(String[] args) {
//     int n = 20;
//     for (int i = 0; i<=n; i++) {
//       int j = 2*i;
//       System.out.println(j);
//       if(j==n){
//         break;
//       }
//     }
//   }


// //********* To print all even number in given range
//   public static void main(String[] args) {
//     int st = 2;
//     int ed = 20;
//     for (int i = st; i<=ed; i++) {

//       int j = 2*i;
//       System.out.println(j);
//       if(j==ed){
//         break;
//       }
//     }
//   }

// /14.**********sum of all natural number using recursion*********** */
// public static void main(String[] args) {
//   int n = 10;
//   System.out.println(sum(n));
// }

// static int sum(int n){
//   if(n==1){
//     return 1;
//   }
  
//   return n+sum(n-1);
// }


// 15.	WAP to print sum of digits of a given number*************
// public static void main(String[] args) {
//   int n = 123456789;
//   int sum=0;
//   while (n>0) {
//     int rem = n%10;
//     sum+=rem;
//     n = n/10;
//   }
  
//   System.out.println(sum);
// }

// 16.	WAP to count the number of digits of a given number************
//   public static void main(String[] args) {
//   int n = 4569;
//   int count=0;
//   while (n>0) {
//     int rem = n%10;
//     count++;
//     n = n/10;
//   }
//   System.out.println(count);
// }
  

// 17.	WAP to reverse a given number***************
  // public static void main(String[] args) {
  //   int n = 4569;
  // int reverse=0;
  // while (n>0) {
  //   int rem = n%10;
  //   reverse = reverse*10+rem;
  //   n = n/10;
  // }
  // System.out.println(reverse);
  // }

  // 18.	WAP to check a number is palindrome or not***********
  //   public static void main(String[] args) {
  //     int originalNumber = 121;
  //     int n = originalNumber;
  //     int reversedNumber = 0;

  //     while (n > 0) {
  //         int rem = n % 10;
  //         reversedNumber = reversedNumber * 10 + rem;
  //         n = n / 10;
  //     }

  //     if (reversedNumber == originalNumber) {
  //         System.out.println("Palindrome");
  //     } else {
  //         System.out.println("Not Palindrome");
  //     }
  // }

  // 19.	WAP to find all the factors or divisors of a given number[mtlb jo no. is given no. ko divide kar de--divisor]******************
  // public static void main(String[] args) {
  //   int n = 244;
  //   for (int i = 1; i<=n; i++) {
  //     if(n%i==0){
  //       System.out.println(i);
  //     }
  //   }
  //   System.out.println("These are the all the factor/divisors----");
  // }

  // 20.	WAP to count the number of factors/divisors of a given number****************
  // public static void main(String[] args) {
  //   int n = 24;
  //   int count = 0;
  //   for (int i = 1; i<=n; i++) {
  //     if(n%i==0){
  //       System.out.println(i);
  //       count++;
  //     }
  //   }
  //   System.out.println("Total factor/divisors------"+count);
  // }

  // 21.	WAP to find sum of all the factors/divisors of a given number******************
  // public static void main(String[] args) {
  //   int n = 244;
  //   int sum = 0;
  //   for (int i = 1; i<=n; i++) {
  //     if(n%i==0){
  //       System.out.println(i);
  //       sum+=i;
  //     }
  //   }
  //   System.out.println("Total Sum of factor/divisor-----"+sum);
  // }

  // 22.To check a number is perfect or not[mtlb given no. ko jo no. divide kar de or un sab divide no. ko add karen to bahi given no mile use perfect no bolte hen]************ */
  // public static void main(String[] args) {
    // int n = 6;
    // int sum=0;
    // for(int i=1; i<n; i++){
    //   if(n%i==0){
    //     sum+=i;
    //   }
    // }
    // if(sum==n){
    //   System.out.println("it is perfect no.");
    // }
    // else{
    //   System.out.println("it is not perfect no");
    // }


  //23.To check a number is perfect or not in given range************
  //   int st=1;
  //   int end=28;

  //   for(int j=st; j<=end; j++){
  //     int n=j;
  //     int sum=0;
  //   for(int i=1; i<n; i++){
  //     if(n%i==0){
  //       sum+=i;
  //     }
  //   }
  //   if(sum==n){
  //     System.out.println("it is perfect no."+sum);
  //   }
    
  // }
// }//main


// 24. WAP to check if a number is prime or not***********
// public static void main(String[] args) {
//   int n = 17;
//   int count = 0;  
//   for (int i = 2; i<n/2; i++) {  //Time complexity n/2 lag rha he mtlb pura n tak nhi chalega uska half chalega
//     if(n%i==0){
//       divisor++;   
//     }
//   }
//   if(count==0){
//     System.out.println("prime no......");
//   }
//   else{
//     System.out.println("Not prime no...");
//   }
  
// }

// 24.[pt] WAP to check if a number is prime or not***********
// public static void main(String[] args) {
//   int n = 17;
//   int divisor = 0;  //ek kudh or 1 jo divide kar sake
//   for (int i = 1; i<=n; i++) { 
//     if(n%i==0){
//       divisor++;   
//     }
//   }
// //divisior 1 or kudh no. he agar divisor isse jada aaye to not prime no
//   if(divisor==2){
//     System.out.println("prime no......");
//   }
//   else{
//     System.out.println("Not prime no...");
//   }
  
// }

// // 25.	WAP to print all the prime numbers between two given range
// public static void main(String[] args) {
//   int st = 1;
//   int end = 31;
//   for (int i = st; i<=end; i++) {
//     int divisor = 0;  //ek kudh or 1 jo divide kar sake
//       for (int j = 2; j <=i; j++) {
//         if(i%1==0 && i%j==0){
//           divisor++;
//           if(divisor==2){
//             break;
//           }
//         } 
//       }
//       if(divisor==1){
//         System.out.println(i);
//       }
//   }
//   System.out.println("ALL these are prime no----");
// }


// 26.	WAP to print alternate prime numbers between two given range
// public static void main(String[] args) {
//   int N = 15;
//   int p=1;
//   for (int i = 1; i<=N; i++) {
//     int divisor = 0;  //ek kudh or 1 jo divide kar sake
//       for (int j = 2; j <=i; j++) {
//         if(i%1==0 && i%j==0){
//           divisor++;
//           if(divisor==2){
//             break;
//           }
//         } 
//       }

//       if(divisor==1){
//         if(p==1){        //With the help of this [if condition] we print alternate no.
//           System.out.println(i);
//           p++;
//         }else{
//           p--;
//         }
//       }
//   }
//   System.out.println("ALL these are prime no----");
// }



// 27.	WAP to find sum of all prime numbers between two given range
// public static void main(String[] args) {
//   int st = 1;
//   int end = 15;
//   int sum=0;
//   for (int i = st; i<=end; i++) {
//     int divisor = 0;  //ek kudh or 1 jo divide kar sake
//       for (int j = 2; j <=i; j++) {
//         if(i%1==0 && i%j==0){
//           divisor++;
//           if(divisor==2){
//             break;
//           }
//         } 
//       }
//       if(divisor==1){
//         sum+=i;
//         System.out.println(i);
//       }
//   }
//   System.out.println("Total sum of prime no.----"+sum);
// }


// 28.	WAP to print factorial of a given number without recursion
// public static void main(String[] args) {
//   int n = 5;
// int factorial = 1;
// for(int i=1; i<=n; i++){
// factorial*=i;
// }
// System.out.println(factorial);
// }


// 31.	WAP to swap two numbers without using third variable
// public static void main(String[] args) {
//   int a = 3;
//   int b = 4;
//   a = a+b;
//   b = a-b;
//   a = a-b;
//   System.out.println("a = "+a);
//   System.out.println("b = "+b);
// }



// 32.	WAP to print Fibonacci series up-to nth term without recursion

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter the value of n: ");
    //     int n = scanner.nextInt();

    //     System.out.println("Fibonacci series up to " + n + " terms:");
    //     printFibonacciSeries(n);

    //     scanner.close();
    // }

    // public static void printFibonacciSeries(int n) {
    //     int firstTerm = 0, secondTerm = 1;

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(firstTerm + " ");

    //         int nextTerm = firstTerm + secondTerm;
    //         firstTerm = secondTerm;
    //         secondTerm = nextTerm;
    //     }
    // }



    //34.	WAP to print Fibonacci series up-to nth term using recursion

  //   public static void main(String[] args) {
  //     Scanner sc = new Scanner(System.in);
  //     System.out.println("Enter a number :");
  //     int n = sc.nextInt();
  //     sc.close();
  //     //fabonacci serier always start with 0 starting pint 
  //     for(int i=0;i<n;i++){
  //         System.out.print(fibb(i)+" ");
  //     }
  // }

  //   static int fibb(int n){

  //           if(n==0){
  //               return 0;
  //           }
  //           if(n==1){
  //               return 1;
  //           }
  //           return fibb(n-1)+fibb(n-2);
  //      }
    

//38.	WAP to check if a number is Armstrong/Strong

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number :");
//     int x = sc.nextInt();
//     sc.close();

//     if(armstrongNumber(x))
//         System.out.println("It is a Armstrong number");
//     else
//         System.out.println("It is not a Armstrong number");
// }


//     static int countNumber(int x){
//         int count = 0;
//         while (x>0) {
//             x = x/10;
//             count++;
//         }
//         return count;
//     }

//     static int power(int x){
//         int sum=0;
//         int pow = countNumber(x);
//         while (x>0) {
//             int result = 1;
//             int rem = x%10;
            
//             for(int i=1;i<=pow;i++){
//                 result = rem*result;
//             }
//             x = x/10;
//             sum = sum + result;
//         }
//         return sum;
//     }

//     static boolean armstrongNumber(int x){
//         int p = power(x);
//         if (x == p) {
//             return true;
//         }
//         return false;
//     }





 }//class

