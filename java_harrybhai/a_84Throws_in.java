// Throw vs Throws

/******Throws helps to already tell or inform that it will also gives some arithmetic error******/
// And whenever anyone call this method first should have to handle the Exception 

public class a_84Throws_in {
    //abhishek created
    public static int divisible(int a ,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //Dhakad gives mistake in myprogramm
        try{
            int c = divisible(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
          System.out.println("Exception occurs");
        }
    }
}
