/**********throw the exception in the catch part*********/


import java.util.Scanner;

class myexception extends Exception{
    public String toString(){
        return "i am tostring()";
    }
    public String getMessage(){
        return "i am getstring()";
    }
}

public class a_83ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a<9){
            try{
                throw new myexception();    //throw the exception in catch part
            }
            catch(Exception e){
              System.out.println(e.toString());
              System.out.println(e.getMessage());
              System.out.println(e);
              e.printStackTrace(); //this will trace where is exception 
            }
        }
        else{
            System.out.println("The value is out of range");
        }
    }
}
