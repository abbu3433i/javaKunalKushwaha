/********constructor in Thread*****/

class mythr extends Thread{
     mythr(String name){   /*constructor*/
        super(name);
    }
    public void run(){
        int x = 45;
        System.out.println("hellow bacchon"+x);
    }
}



public class a_73Constuctor_In_Threading {
    public static void main(String[] args) {
        mythr b = new mythr("abhishek");
        b.start();

        // This getname is gives the string taken by constructor
        System.out.println("printing thread name is "+ b.getName());
    }
}
