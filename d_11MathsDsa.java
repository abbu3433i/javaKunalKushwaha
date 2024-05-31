/**************Maths for DSA***************** */

public class d_11MathsDsa {

    /************How many prime no between given no.********* */
    // public static void main(String[] args) {
    //     int n = 40;
    //     boolean[] arr = new boolean[n+1];
    //     sieveprime(n, arr);
    // }

    // static void sieveprime(int n,boolean[] arr){
    //     for (int i = 2; i*i<=n; i++) {
    //         if (!arr[i]) { //--arr ka i false ho means "not true"
    //         //----jo value i me he usko chodhke uske table{2x2=4} ko less than n tak true kar do
    //             for (int j = i*2; j<=n; j+=i) {//-----ye saari even value ko true kar dega
    //                 arr[j]=true;
    //             }
    //         }
    //     }

    //     //---------isme false value print ho jayengi which is prime
    //     for (int i = 2; i<=n; i++) {
    //         if (!arr[i]) {
    //             System.out.print(i+" ");
    //         }
    //     }
    // }



    /****************Finding square root of a given no. decimal as well************************* */
    public static void main(String[] args) {
        int n = 40;
        int p = 3;//----presisure value means how many decimal you want
        System.out.printf("%.3f", sqrt(n, p));
    }

    //----simply binary search apply
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;

        double root = 0.0;
        while (s<=e) {
            int mid = s + (e - s) / 2;

            if (mid*mid==n) {
                return mid;
            }
            if (mid*mid>n) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
    //---------for decimal values ke liye 
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n) { 
                root+=incr;
            }
            root-=incr; //ek kam kar dega to perfect value milegi
            incr /= 10;//---increment for next decimal 
        }

        return root;
    }



    /****************GCD greatest common decimal************** */
    // public static void main(String[] args) {
    //     System.out.println("The greatest common decimal is:");
    //     System.out.println(gcd(4, 8));
    // }

    // static int gcd(int a,int b){
    //     if (a==0) {
    //         return b;
    //     }
    //     return gcd(b%a,a);  //---recursion
    // }




    //*******LCM least common multiplier
    // static int lcm(int a,int b){
    //     return a*b / gcd(a, b);
    // }
    // public static void main(String[] args) {
    //     System.out.println(lcm(4, 8));
    // }





}//class
