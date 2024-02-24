public class a_34Recursion {
    /********Recursion*********/
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;                          
        }
        else{
            return n*factorial(n-1);            //ulta count karega 5*4*3*2*1
        }
    }
 
    /********factorial by iterative method******** */
     static int factorial_iterative(int n){
        int product = 1;
        for(int i=1; i<=n; i++){                //seedha count karega 1*2*3*4*5
            product *= i;                               
        }
        return product;
     }


    public static void main(String[] args){
        int x = 5;
        System.out.println("The factorial of the given no. is: "+factorial(x));
        System.out.println("The factorial of the given no. is: "+factorial_iterative(x));
    }
}
