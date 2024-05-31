/*******There are 3 types of error: syntax error which mean compile time,logical error,Runtime error*******/
// Exception is handle by--> Try,catch and block


public class a_80ExceptionHandling {
    public static void main(String[] args) {
        int a = 25;
        int b = 0;
        int c = a/b;   //0 not divide 25
//-----------------------------------------------------Exception handle here
        // try {
        //     int c = a/b;   //0 not divide 25
        //     System.out.println(c);
        // } 
        // catch (Exception e) {
        //  System.out.println("we failed to divide");
        //  System.out.println("Reson: "+e);
        // }



        System.out.println("not run");  //--mtlb jab tak exception handle nhi karenge aage ka code nhi chalega isliye handle karna jaroori he 
    }
}
