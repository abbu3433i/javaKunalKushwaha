/***********Multithreading it is doing multiple work at a same time***********/


class threading extends Thread{      //extends to Thread which is store in the package of java
    public void run(){
        int i =0;
        while(i<200){
            System.out.println("thread is chatting");
            System.out.println("i am happy");
            i++;
        }
    }
}

class threading2 extends Thread{
    public void run(){
        int i = 0;
        while(i<200){
            System.out.println("thread is playing");
            System.out.println("i am sad");
            i++;
        }
    }
}


public class a_70Multithreading {
    public static void main(String[] args) {
        threading t = new threading();
        threading2 c = new threading2();
        t.start();
        c.start();
    }
}
