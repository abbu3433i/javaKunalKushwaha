//Finally statement 

public class a_85FinallyBlock {
    public static int great(){
        try{
            int a =52;
            int b = 10;
            int c = a/b;
            return c;
        }  //here prog.. is over and still finally statemnt is printed

        catch(Exception e){
            System.out.println("EXCEPTION occurs");
        }

       //finally statement will everytime and always print 
         finally{
            System.out.println("Cleaning the code........END");
         }

         return 0;
    }
    
    public static void main(String[] args) {
        int k = great();
        System.out.println(k);
    }
}
