/***Ek class me 3 function hon or unke arguments alag hon usse
  method overiding khehte hen****/

public class a_32Overloading {

    /***refrence 1****/
    static void telljoke(){     //this is like a function
        System.out.println("The telljoke is a successfully printed");
    }

    /***refrence 2****/
    static void change2(int []arr){
        arr[0] = 95;
    }

    /*********Method overloading is here in 3 **********/
    static void foo(){
        System.out.println("Hellow bro i am here");
    }
    static void foo(int a){
        System.out.println("this is the foo "+a+" and me.");
    }
    static int foo(int a1,int b1){
        System.out.println("this is the foo "+a1+" and me.");
        System.out.println("this is the foo "+b1+" and me.");
        return 5;
    }
    

   public static void main(String[] args){
    // telljoke();    isko main me call krr diya 

    int [] marks = {25,45,36,87,12,96};
    change2(marks);
    System.out.println("The value of the marks is "+marks[0]);

    /*************overloading concept is here *****/
    foo();
    foo(500);
    foo(40,47);
   }
}
