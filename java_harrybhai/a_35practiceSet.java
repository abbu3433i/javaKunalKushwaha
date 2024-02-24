public class a_35practiceSet {
    
    /*******problem 1****multiplicationTable****/
    // static void multiplicationTable(int n){
    //     for(int i=1; i<=n; i++){
    //         System.out.format("%d x %d = %d\n",n,i,n*i);
    //     }
    // }

    /********problem 2****print stars increasing order***** */
    //  static void stars(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<i+1; j++){       
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //  }
     static void stars(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){       
                System.out.print("*");
            }
            System.out.println();
        }
     }

     /********problem 3****Sum natural no. with help the of recursive function**** */
//  static int sumRec(int n){
//     if(n==1){
//         return 1;
//     }
//     return n + sumRec(n-1);
// }

    /********fabonacci serice--0, 1, 1, 2, 3, 5, 8, 13, 21, 34********/
    static int fib(int n){
    if(n==1 || n==2){
        return n-1;
    }
    return fib(n-1) + fib(n-2);
   }

    public static void main(String[] args){
    //    /*1.*/ multiplicationTable(10);   //fn call

       /*2.*/ stars(5);                  

    //    /*3.*/ int c = sumRec(4);
    //     System.out.println(c);

    //    /*4.*/ opposite(5);

       /*5.*/  int d = fib(7);
       System.out.println("The fabonacci series number is: "+d);
    }
}
