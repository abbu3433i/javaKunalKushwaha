public class a_25Setpractice {
    public static void main(String[] args) {

        /******** practice 1---stars print decreasing order*******/
        for(int i=4; i>0; i--){
        for(int j=0; j<i; j++){
        System.out.print("*");
        }
        System.out.print("\n");
        }

        /******* practice 2---sum of even no. *******/
        // int sum=0;
        // int n = 4;
        // for(int i=0; i<n; i++){
        // sum = sum + (2*i);
        // }
        // System.out.println("Sum of the n even no is: "+sum);

        /************ practice3---5 ka table ***********/
        // int n = 5;
        // for(int i=1; i<10; i++){
        // System.out.printf("%d x %d = %d\n",n,i,n*i);
        // }

        /************ practice4---10 table in reverse way ***********/
        // int n = 10;
        // for(int i=10; i>0; i--){
        // System.out.printf("%d x %d = %d\n",n,i,n*i); /*%d given variable ki value ko
        // store karta he*/
        // }

        /******* practice5---factorial nikalna he *******/
        int n = 5;
        int factorial = 1;
        for(int i=1; i<=n; i++){
        factorial *=i;
        }
        System.out.println("Factorial of given no: "+factorial);

        /***** while se */
        // int n = 5;
        // int factorial = 1;
        // int i=1;
        // while(i<=n){
        // factorial *=i;
        // }
        // System.out.println("Factorial of given no: "+ factorial);
    }
}
