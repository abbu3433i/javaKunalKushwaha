
package leetcode;
public class Pattern {
    public static void main(String[] args) {

        /***Agar "purane bale for loop" ke niche naya for loop chalane ho to phele bale for loop ke bahar
         * naya for loop bana lo to jo bhi next iteration hoga bo purane bale ke niche se hi continue rahega*******/
                int n = 5;
        
                // Print upper part of the pattern
                for (int r = 1; r <= n; r++) {
                    for (int c = 1; c <= r; c++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        
                // Print lower part with decrement for loop
                // for (int r = n - 1; r >= 1; r--) {
                //     for (int c = 1; c <= r; c++) {
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }
            
                //print lower part with increment for loop
                for(int r=1; r<=n-1; r++){

                    for(int c=r; c<=n-1; c++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
       





                
                //     int n = 5;
                // for(int r=1,q=0; r<=n; r++,q++){
                    
                //     for(int c=1,p=5-q; c<=r; c++,p++){
                //         System.out.print(p);
                //     }
                //     System.out.println();
                // }

    }//main
}//class
